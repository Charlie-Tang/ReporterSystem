package com.reporter.test.Tools;

import java.util.List;

import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfStamper;

public class InsertImage {
	public static void insertImage(PdfStamper ps, AcroFields s,String jpgpath)
	{
	 
	 
			try
			{
				List<AcroFields.FieldPosition> list = s.getFieldPositions("Text8");	
				Rectangle signRect = list.get(0).position;
				int page = list.get(0).page;
				//图片路径
				Image image = Image.getInstance(jpgpath);
				PdfContentByte under = ps.getOverContent(page);
				float x = signRect.getLeft();
				float y = signRect.getBottom();
//				System.out.println(x);
//				System.out.println(y);这里是显示该文本域所在方位的
				image.setAbsolutePosition(x, y);
				image.scaleToFit(signRect.getWidth(), signRect.getHeight());
				 
				 
				under.addImage(image);
			}
			catch (Exception e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	 
	 
	}
}
