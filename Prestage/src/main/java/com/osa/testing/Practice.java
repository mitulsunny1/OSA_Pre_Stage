package com.osa.testing;

public class Practice {

	public static void main(String[] args) {
		
		Practice m=new Practice();
		double utilitibill=m.houserent(5000);
	      System.out.println(utilitibill);
	      
	      String s1=m.add("Poly") ;
	      System.out.println(s1);
	      
	      int j=m.multi(100, 20);
	      System.out.println(j);
	     
	      String t="Our Mother Land";
	      String reverse=" ";
	      
	      String[] s4=t.split(" ");
	     for(int i=s4.length-1;i>=0;i--) {
	    	 reverse=reverse.concat(s4[i]).concat(" ");
	    	 
	     } 
	      System.out.println(reverse);
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
		int i=a*b;
		return i;
		
		
	}
	


}
