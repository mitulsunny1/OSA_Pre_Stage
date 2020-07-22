package com.osa.overloading;

public class OverloadingPractice {

	public static void main(String[] args) {
		
		OverloadingPractice m=new OverloadingPractice();
		double utilitibill=m.houserent(5000);
	      System.out.println(utilitibill);
	}
	  
	double houserent(int salary) {
		
	     double rent= salary*.20;
			return rent;
			  

}
	

}
