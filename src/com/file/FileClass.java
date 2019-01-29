package com.file;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.text.Document;

public class FileClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("image_rose.jpg");
		if(f.createNewFile())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("file already exists");
		}
		FileOutputStream fw =new FileOutputStream("D:workspace\\input1.txt");
		//fw.write(65);
		//C:\\Users\\Revature1\\Documents\\rose.jpeg
		String s="Hello this is a new file using scanner ";
		byte b[]=s.getBytes();
		fw.write(b);
		fw.close();
		FileInputStream fin=new FileInputStream("D:\\workspace\\input1.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.println((char)i);
		}
		fin.close();
		File fl=new File("D:\\workspace\\input1.txt");
		Scanner sc=new Scanner (fl);
		while(sc.hasNextLine())
		{
			String data=sc.nextLine();
			System.out.println(data);
		}
		sc.close();
		File fo=new File("C:\\Users\\Revature1\\Pictures\\newImage.jpg");
		FileInputStream finp=new FileInputStream(fo);
		BufferedImage bi=ImageIO.read(finp);
		ImageIO.write(bi,"jpg",f);
		System.out.println("done");
		//Document d=new Document();
		//PdfWriter pw=newPdfWriter();
		
		
	}
	

}
