package com.amalraj1.maventraining;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	static FileInputStream fi;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public static String readString(int i ,int j)throws Exception{
		fi = new FileInputStream("C:\\Users\\dell\\Desktop\\Java\\Book1.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("file");
		XSSFRow row = sh.getRow(i);
		XSSFCell cell = row.getCell(j);
		
		return cell.getStringCellValue();
			
		
	}
	public static double readNumber(int i ,int j)throws Exception{
		fi = new FileInputStream("C:\\Users\\dell\\Desktop\\Java\\Book1.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("file");
		XSSFRow row = sh.getRow(i);
		XSSFCell cell = row.getCell(j);
		
		return cell.getNumericCellValue();
			
		
	}
	
	
	public static void main(String[] args) throws Exception{
		String name = Excel.readString(1,0);
		System.out.println(name);
		double salary = Excel.readNumber(1,1);
		System.out.println(salary);
		
		
		
	}
	
	
	

}
