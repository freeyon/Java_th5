package com.offcn.itext;

import java.io.File;
import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class Demo {
   
	   public static void main(String[] args) throws FileNotFoundException {
		   //������
		   PdfWriter pw=new PdfWriter(new File("D:/Program Files/itext/pw01.pdf"));
		   //�����ĵ�����
		   PdfDocument pd=new PdfDocument(pw);
		   //���������ĵ�����
		   Document d=new Document(pd);
		   //д�����
		   Paragraph p=new Paragraph("11111");
		   //��Ӷ��䵽 �ĵ�
		   d.add(p);
		   //ˢ�¹���
		   d.close();
		   
		   System.out.println("111");
	}
}
