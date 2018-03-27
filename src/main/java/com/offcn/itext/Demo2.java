package com.offcn.itext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfDocumentInfo;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

public class Demo2 {
   
	   public static void main(String[] args) throws Exception {
		   //创建流
		   PdfWriter pw=new PdfWriter(new File("D:/Program Files/itext/pw01.pdf"));
		   //创建文档对象
		   PdfDocument pd=new PdfDocument(pw);
		   //设置文档信息
		   PdfDocumentInfo info=pd.getDocumentInfo();
		   info.setAuthor("我是作者");
		   info.setKeywords("关键字");
		   info.setTitle("大标题");
		   
		   
		   
		   //创建内容文档对象
		   Document d=new Document(pd);
		   //写入段落
		   Paragraph p=new Paragraph("给我一个吻");
		   
		   p.setTextAlignment(TextAlignment.CENTER);//文字位置
		   
		   //创建字体
		   //PdfFont font=PdfFontFactory.createFont(FontConstants.HELVETICA);
		   //字体 中文不乱码
		   PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",true);
		   p.setFont(font);
		   p.setFontColor(Color.GREEN);
		   p.setFontSize(30);
		   
		   //添加段落到 文档
		   d.add(p);
		   //刷新关流
		   d.close();
		   
		   System.out.println("111");
	}
}
