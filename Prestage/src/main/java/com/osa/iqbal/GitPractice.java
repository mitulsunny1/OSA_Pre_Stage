package com.osa.iqbal;

public class GitPractice {

	public static void main(String[] args) {
		
		arrayPractice();
	}
	
	public static void arrayPractice() {
		
		String s= " We are OSA student ";
		String[] s1=s.split("");
		String reverse="";
				for(int i=s1.length-1;i>=0;i--) {
			reverse=reverse.concat(s1[i].concat(" "));
			
		}
		
		System.out.println(reverse);
	}
	
}
