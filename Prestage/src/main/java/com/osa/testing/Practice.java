package com.osa.testing;

public class Practice {

	public static void main(String[] args) {
		
		Practice m=new Practice();
		double utilitibill=m.houserent(5000);
	      System.out.println(utilitibill);
	}
	  
	double houserent(int salary) {
		
	     double rent= salary*.20;
			return rent;
			  
	}
	
	public String add(String name) {
		
		String s=name;
		return s;
		
	}

}
