package com.osa.filemanager;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileManager {
	public static void main(String[] args) throws IOException {
		System.out.println("EXCEL FILE");
		System.out.println("--------------------");

		Excel_File();
		 System.out.println("PROPERTY FILE");

		Property_File();
		System.out.println("--------------------");
		System.out.println("TEXT FILE");
		System.out.println("--------------------");

		Text_File();
		
	}

	public static void Excel_File() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\theki\\Desktop\\Book1.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowSize = sheet.getLastRowNum();
		int colSize = sheet.getRow(0).getLastCellNum();

		Object[][] store = new Object[rowSize][colSize];

		for (int i = 1; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {

				System.out.println(store[i-1][0] = sheet.getRow(i).getCell(j));

			}

			System.out.println("-----------------------");

		}
		book.close();
	}

	public static void Property_File() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\theki\\Desktop\\something.properties");
		Properties p = new Properties();
		p.load(f);
		String o = p.getProperty("Browser");
		
		System.out.println(o);

		String r = p.getProperty("Sport");
		System.out.println(r);

		String h = p.getProperty("Name");
		System.out.println(h);

		f.close();
		System.out.println("-----------");
	}

	public static void Text_File() throws IOException {

		FileReader file = new FileReader("C:\\Users\\theki\\Desktop\\Test.txt");
		BufferedReader bf = new BufferedReader(file);
		String store = "";
		while ((store = bf.readLine()) != null) {
			System.out.println(store);

		}
		file.close();

	}

}
