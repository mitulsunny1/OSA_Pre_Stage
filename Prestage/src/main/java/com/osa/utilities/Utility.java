package com.osa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
public static Properties readPropFile(String path) {
		
		Properties prop=new Properties();
		try {
			FileInputStream file=new FileInputStream("src\\readMyText.properties");
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		return prop;
	}

}
