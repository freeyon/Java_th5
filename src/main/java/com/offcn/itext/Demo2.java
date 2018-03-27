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
		   //������
		   PdfWriter pw=new PdfWriter(new File("D:/Program Files/itext/pw01.pdf"));
		   //�����ĵ�����
		   PdfDocument pd=new PdfDocument(pw);
		   //�����ĵ���Ϣ
		   PdfDocumentInfo info=pd.getDocumentInfo();
		   info.setAuthor("��������");
		   info.setKeywords("�ؼ���");
		   info.setTitle("�����");
		   
		   
		   
		   //���������ĵ�����
		   Document d=new Document(pd);
		   //д�����
		   Paragraph p=new Paragraph("����һ����");
		   
		   p.setTextAlignment(TextAlignment.CENTER);//����λ��
		   
		   //��������
		   //PdfFont font=PdfFontFactory.createFont(FontConstants.HELVETICA);
		   //���� ���Ĳ�����
		   PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",true);
		   p.setFont(font);
		   p.setFontColor(Color.GREEN);
		   p.setFontSize(30);
		   
		   //��Ӷ��䵽 �ĵ�
		   d.add(p);
		   //ˢ�¹���
		   d.close();
		   
		   System.out.println("111");
	}
}
