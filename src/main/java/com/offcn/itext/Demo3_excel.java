package com.offcn.itext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.GroupLayout.Alignment;

import org.omg.CORBA.Principal;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfDocumentInfo;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;

public class Demo3_excel {
   
	   public static void main(String[] args) throws Exception {
		   //������
		   PdfWriter pw=new PdfWriter(new File("D:/Program Files/itext/pw02.pdf"));
		   //�����ĵ�����
		   PdfDocument pd=new PdfDocument(pw);
		   //���������ĵ�����
		   Document d=new Document(pd);
		
		   //�������
		   //��������
		   UnitValue[] uv=UnitValue.createPercentArray(new float[]{20f,20f,40f,20f});
		   Table table =new Table(uv);
		   table.setWidthPercent(100);//���ñ����ռ��
		  
		   //������ͷ 
		   Cell headerCell=new Cell(1,4); //һ�� ���е�Ԫ��
		   headerCell.add(new Paragraph("HEADER CELL").setBackgroundColor(Color.GREEN).setTextAlignment(TextAlignment.CENTER));
		   
		  //����ͷ����table��
		   table.addHeaderCell(headerCell);
		   
		   Cell c1=new Cell();
		   c1.add(new Paragraph("one"));
		   Cell c2=new Cell();
		   c2.add(new Paragraph("two"));
		   Cell c3=new Cell();
		   c3.add(new Paragraph("three"));
		   Cell c4=new Cell();
		   c4.add(new Paragraph("four"));
		   table.addCell(c1);
		   table.addCell(c2);
		   table.addCell(c3);
		   table.addCell(c4);
		   
		   
		   for (int i = 0; i < 3; i++) {
			   Cell cell=new Cell(2,1);
			   cell.setBackgroundColor(Color.GRAY);
			   table.addCell(cell);
			   for (int j = 0; j < 6; j++) {
				   Cell c=new Cell();
				   c.add(new Paragraph(i+"-"+j));
				   table.addCell(c);
			}
			
		}
		   
		   //��Ӷ��䵽 �ĵ�
		   d.add(table);
		   //ˢ�¹���
		   d.close();
		   
		   System.out.println("111");
	}
}
