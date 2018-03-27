package com.offcn.itext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.GroupLayout.Alignment;

import org.omg.CORBA.Principal;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfDocumentInfo;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Demo4_img {
   
	   public static void main(String[] args) throws Exception {
		   //������
		   PdfWriter pw=new PdfWriter(new File("D:/Program Files/itext/pw03.pdf"));
		   //�����ĵ�����
		   PdfDocument pd=new PdfDocument(pw);
		   //���������ĵ�����
		   Document d=new Document(pd);
		
		  //���ͼƬ
		   Image img=new Image(ImageDataFactory.create("D:/Program Files/itext/1.jpg"));
		   
		   
		   
		   //��Ӷ��䵽 �ĵ�
		   d.add(img);
		   //ˢ�¹���
		   d.close();
		   
		   System.out.println("111");
	}
}
