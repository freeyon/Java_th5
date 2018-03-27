package com.offcn.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi01 {
       public static void main(String[] args) throws IOException {
		  //写文件 03版exc   07 使用XssfWorkBook      文件保存后缀  xlsx
    	   XSSFWorkbook workBook=new XSSFWorkbook();//文档
    	   XSSFSheet sheet=workBook.createSheet();//sheep
    	   
    	   CellRangeAddress cra=new CellRangeAddress(4,7,8,10);//合并的单元格
    	   sheet.addMergedRegion(cra);//将合并项添加到 sheet
    	   
    	   XSSFRow r=sheet.createRow(4);
    	   XSSFCell c=r.createCell(8);
    	   
    	   c.setCellValue("合并");
    	   
    	   //创建单元格 样式
    	   
    	   CellStyle cs=workBook.createCellStyle();
    	   cs.setAlignment(HorizontalAlignment.CENTER);//水平居中
    	   cs.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
    	   
    	   c.setCellStyle(cs);
    	   
    	   
    	   
    	   
    	   workBook.write(new FileOutputStream(new File("D:\\Program Files\\poi\\test05.xlsx")));
    	   
    	   System.out.println(11111);
	}
}
