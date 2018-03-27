package com.offcn.poi;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class poi_itor {
       
	public static void main(String[] args) throws Exception {
		 read01();
	}
	
	//第一种遍历
	
     public static void read01() throws Exception{
    	 
    	 String s="D:\\Program Files\\poi\\test01.xls";
    	 
    	 Workbook wb=WorkbookFactory.create(new File(s));
    	 
    	 /*int n=wb.getNumberOfSheets();//得到sheet数量 然后 for遍历
    	 Sheet sh=wb.getSheetAt();//等到第几个sheet
    	 int n2=sh.getPhysicalNumberOfRows();//得到row数量 再遍历
    	 Row r=sh.getRow()//得到第几个row  ....    	 */    	 
    	 Iterator<Sheet> sheet = wb.sheetIterator();
    	 
    	 while (sheet.hasNext()) {
			Sheet sh = (Sheet) sheet.next();
			Iterator<Row> rowIterator = sh.rowIterator();
			
			while (rowIterator.hasNext()) {
				Row row = (Row) rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while (cellIterator.hasNext()) {
					Cell cell = (Cell) cellIterator.next();
					CellType cellTypeEnum = cell.getCellTypeEnum();
					switch (cellTypeEnum) {
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+"\t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue()+"\t");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue()+"\t");
						break;
					case _NONE:
					case BLANK:	
						System.out.print("-空-\t");
						break;
					case ERROR:
						System.out.print("错误\t");
						break;
					default:
						break;
					}
					
				}
				System.out.println();
			}
			
		}
    	 
     }
}
