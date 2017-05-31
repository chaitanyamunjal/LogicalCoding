package com.coding;

import java.util.Scanner;

public class PatternPrint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int n = 0;
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		
		int j = 0; 
		
		for(int i = n; i > 0 ; i--)
		{
			j = n;
			for(; j > i ; j--)
			{
				System.out.print(j+" ");
			}
			for(int k = j;k>0;k--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
