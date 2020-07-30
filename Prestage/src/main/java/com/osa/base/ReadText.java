package com.osa.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException {
		ReadText.read2();
	
	}
	
public static void read2() throws IOException {
	
	File f=new File("C:\\Users\\Bashar\\Desktop\\OSA1221201905A\\new.txt ");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String R1;
	while((R1=br.readLine())!=null) {
		
		System.out.println(R1);
	}
	
	//String[] R2=R1.split(" ");
	
	
	
	
}
	
	
}