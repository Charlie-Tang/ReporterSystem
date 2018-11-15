package com.reporter.test.Tools;

import java.awt.image.BufferedImage;

public class QRCodeImage implements jp.sourceforge.qrcode.data.QRCodeImage {
	BufferedImage bufferedImage;
 
	public QRCodeImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}
 
	@Override
	public int getHeight() {
		return bufferedImage.getHeight();
	}
 
	@Override
	public int getPixel(int arg0, int arg1) {
		return bufferedImage.getRGB(arg0, arg1);
	}
 
	@Override
	public int getWidth() {
		return bufferedImage.getWidth();
	}
 
}