package com.offcn.poi;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Poi3 {
       public static void main(String[] args) throws IOException {
		  //д�ļ� 03��exc   07 ʹ��XssfWorkBook      �ļ������׺  xlsx
    	   HSSFWorkbook workBook=new HSSFWorkbook();//�ĵ�
    	   HSSFSheet sheet=workBook.createSheet();//sheep
    	   HSSFRow row=sheet.createRow(0);//��
    	   HSSFCell cell=row.createCell(0);//��
    	   cell.setCellValue("���ǲ�һ��");
    	   
    	   workBook.write(new File("D:\\Program Files\\poi\\test01.xls"));
    	   
    	   System.out.println(11111);
	}
}
