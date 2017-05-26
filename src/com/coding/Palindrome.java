package com.coding;

import java.util.Scanner;

public class Palindrome {

	public void checkPal(String check){
		
		String reverse = "";
		for(int i= check.length()-1;i>=0;i--){
			reverse = reverse + check.charAt(i);
		}
		
		if(check.equals(reverse)){
			System.out.println(" Palindrome !!");
		}else{
			System.out.println("Not Palindrome!");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string :- ");
		Scanner sc =  new Scanner(System.in);
		String check = sc.nextLine();
		Palindrome obj = new Palindrome();
		obj.checkPal(check);
		
	}

}
