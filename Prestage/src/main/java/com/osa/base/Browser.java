package com.osa.base;

public class Browser {
 public static void main(String[] args) {
  //String n[]=getName();
  String p[]= {"Tom","John","Raka","Chaka"};
  printArrayValue(p);
 }

 
 
 //Returning String array
 public static String[] getName() {
	 String name[]= {"Md","Adnan","Anis","Khairul","Masum","Rupak","Shoshy"};
	 return name;
 }
 
 //Parameterize method that is taking String array as a parameter.
 public static void printArrayValue(String[] array) {
	 for (String string : array) {
		System.out.println(string);
	}
 }
//Homework:
 // Create array same as above for each of the data type like  int, double, shot,byte,long,char. 
 
}
