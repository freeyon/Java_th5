package com.offcn.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Poi2 {
       public static void main(String[] args) throws IOException {
		  //���ļ�
    	   HSSFWorkbook workBook=new HSSFWorkbook(new FileInputStream(new File("D:\\Program Files\\poi\\test01.xls")));
    	   HSSFSheet sheet=workBook.getSheet("Sheet0");//sheep
    	   HSSFRow row=sheet.getRow(0);//��
    	   HSSFCell cell=row.getCell(0);//��
    	   String s=cell.getStringCellValue();    	   
    	   
    	   
    	   System.out.println(s);
	}
}
