package com.osa.base;

import java.util.Scanner;

public class PracticeRegular {



public static void main(String[] args) {
	calculation();
	
}

public static void calculation() {

String a= "Hellow Bangladesh";

//String reverse="";

String[] a1=a.split(" ");

String reverse=" ";

for(int i=a1.length-1;i>=0;i--) {
	
	reverse=reverse.concat(a1[i].concat(""));
	
}
System.out.println(reverse);

	
}
}