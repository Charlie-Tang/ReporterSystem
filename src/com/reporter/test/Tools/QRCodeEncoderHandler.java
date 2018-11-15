package com.reporter.test.Tools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.imageio.ImageIO;
import com.swetake.util.Qrcode;

 
public class QRCodeEncoderHandler {

	
	public void encoderQRCode(String content, String imgPath) { 
       try { 
           Qrcode qrcodeHandler = new Qrcode(); 
        // 设置二维码排错率，可选L(7%)、M(15%)、Q(25%)、H(30%)，排错率越高可存储的信息越少，但对二维码清晰度的要求越小 
           qrcodeHandler.setQrcodeErrorCorrect('H'); 
           qrcodeHandler.setQrcodeEncodeMode('B'); 
           //设置二维码版本
           qrcodeHandler.setQrcodeVersion(15); 
           System.out.println(content); 

           byte[] contentBytes = content.getBytes("utf-8"); 
           BufferedImage bufImg = new BufferedImage(230, 230, 
                   BufferedImage.TYPE_INT_RGB); 
           Graphics2D gs = bufImg.createGraphics(); 
           gs.setBackground(Color.WHITE); 
           gs.clearRect(0, 0, 230, 230); 
           // 设定图像颜色> BLACK 
           gs.setColor(Color.BLACK); 
           // 设置偏移量 不设置可能导致解析出错 
           int pixoff = 2; 
           // 输出内容> 二维码 
           if (contentBytes.length > 0 && contentBytes.length < 800) { 
               boolean[][] codeOut = qrcodeHandler.calQrcode(contentBytes); 
               for (int i = 0; i < codeOut.length; i++) { 
                   for (int j = 0; j < codeOut.length; j++) { 
                       if (codeOut[j][i]) { 
                           gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3); 
                       } 
                   } 
               } 
           } else { 
               System.err.println("QRCode content bytes length = " 
                       + contentBytes.length + " not in [ 0,140 ]. "); 
           } 
           gs.dispose(); 
           bufImg.flush(); 
           File imgFile = new File(imgPath);
           if (!imgFile.exists()) {
        	   OutputStream out = new FileOutputStream(imgFile);
        	   out.flush();
        	   out.close();
           }
           // 生成二维码QRCode图片 
           ImageIO.write(bufImg, "png", imgFile); 
       } catch (Exception e) { 
           e.printStackTrace(); 
       } 
   } 
   /**
    * @param args the command line arguments
 * @throws IOException 
    */ 
 
 
   public static void main(String[] args) throws IOException {
//	   //生成二维码
//   	//取当前时间为图片名称 带毫秒的
   	   SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS" );
   	   Date d=new Date();
   	   String str=sdf.format(d);
       String imgPath = "D:/"+str+".png"; 
       String content= "http://172.16.38.54:8080/Reporting%20system/Login.jsp";
//      http://172.16.38.54:8080/Reporting%20system/Upload/tangqichang/%E6%9C%89%E6%9C%BA%E9%85%B8/2018-08-07/outdir/18S3977511-%E5%B0%8F%E9%BB%84-%E5%A5%B3-%E5%B0%BF%E6%BB%A4%E7%BA%B8%E7%89%87.pdf
       
       QRCodeEncoderHandler handler = new QRCodeEncoderHandler(); 
       handler.encoderQRCode(content, imgPath); 
//       System.out.println("imgPath:"+imgPath);
//       System.out.println("encoder QRcode success"); 
       
       
   } 
} 