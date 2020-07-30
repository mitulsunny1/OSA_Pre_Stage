package com.osa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	
	
	public static void main(String[] args) throws IOException {
		
		ReadProperty.read1();	
		
	}
	
	public static void read1() throws IOException {
		
		FileInputStream fil=new FileInputStream("C:\\Users\\Bashar\\Desktop\\Git new\\OSA_Pre_Stage\\Prestage\\src\\main\\java\\com\\osa\\base\\reading.properties");
				
		Properties P;
		P=new Properties();
		P.load(fil);
		String S1=P.getProperty("name");
		String S2=P.getProperty("address");
		String S3=P.getProperty("country");
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		
		
		
	}
	
}
