package com.osa.testing;

public class Practice {

	public static void main(String[] args) {
		
		Practice m=new Practice();
		double utilitibill=m.houserent(5000);
	      System.out.println(utilitibill);
	      
	      String s1=m.add("Poly") ;
	      System.out.println(s1);
	      
	      int j=m.multi(100, 200);
	      System.out.println(j);
	     
	      
	}
	  
	double houserent(int salary) {
		
	     double rent= salary*.20;
			return rent;
			  
	}
	
	public String add(String name) {
		
		String s=name;
		return s;
		
	}
	
	public int multi(int a,int b) {
		int i=a+b;
		return b;
		
		
	}

}
