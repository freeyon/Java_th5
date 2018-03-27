package com.offcn.itext;

import java.io.File;
import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class Demo {
   
	   public static void main(String[] args) throws FileNotFoundException {
		   //创建流
		   PdfWriter pw=new PdfWriter(new File("D:/Program Files/itext/pw01.pdf"));
		   //创建文档对象
		   PdfDocument pd=new PdfDocument(pw);
		   //创建内容文档对象
		   Document d=new Document(pd);
		   //写入段落
		   Paragraph p=new Paragraph("11111");
		   //添加段落到 文档
		   d.add(p);
		   //刷新关流
		   
		   d.close();
		   
		   System.out.println("111");
	}
}
