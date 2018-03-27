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
		  //写文件 03版exc   07 使用XssfWorkBook      文件保存后缀  xlsx
    	   HSSFWorkbook workBook=new HSSFWorkbook();//文档
    	   HSSFSheet sheet=workBook.createSheet();//sheep
    	   HSSFRow row=sheet.createRow(0);//行
    	   HSSFCell cell=row.createCell(0);//列
    	   cell.setCellValue("我们不一样");
    	   
    	   workBook.write(new File("D:\\Program Files\\poi\\test01.xls"));
    	   
    	   System.out.println(11111);
	}
}
