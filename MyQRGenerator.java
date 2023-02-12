package com.qrcode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

public class MyQRGenerator {

	public static void main(String[] args) throws IOException {

		String url = "https://www.cumminscollege.org/";
		File file = new File("qr.png");
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);

		ByteArrayOutputStream bos = 
				QRCode.from(url).withSize(500, 500).to(ImageType.PNG)
				.withColor(0xFFFF0000, 0xFFFFFFAA).stream();
		bos.writeTo(fos);
		System.out.println(file.getAbsolutePath());
	}
}
