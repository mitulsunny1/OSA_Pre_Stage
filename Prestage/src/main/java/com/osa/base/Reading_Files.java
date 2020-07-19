package com.osa.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Files {

	public static void main(String[] args) throws IOException {

	
	PropertyFileRead();
	
	 

}

	
	public static void excelRead() throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\theki\\Desktop\\Book1.xlsx ");
		XSSFSheet sheet = book.getSheet("Sheet1");
		int getRow = sheet.getLastRowNum();
		// System.out.println(getRow);
		int colNum = sheet.getRow(0).getLastCellNum();

		Object[][] store = new Object[getRow][colNum];

		for (int i = 1; i <= getRow; i++) {

			for (int k = 0; k < colNum; k++) {

				System.out.println(store[i - 1][k] = sheet.getRow(i).getCell(k));
			}
            System.out.println("----------------------");

		}

		book.close();
	}
	
	public static void PropertyFileRead() throws IOException {
		
		FileInputStream r = new FileInputStream("C:\\Users\\theki\\Desktop\\something.properties");
		Properties x = new Properties();
		x.load(r);
	String h =x.getProperty("Name");
	System.out.println(h);
		
r.close();
	}
	
		
		
	
	
	
	
}
