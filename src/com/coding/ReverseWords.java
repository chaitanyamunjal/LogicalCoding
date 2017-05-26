package com.coding;

public class ReverseWords {

	public String reverseWord(String a){
		
		String reversedWord = "";
		
		for(int i = a.length()-1 ; i >= 0 ; i--){
			reversedWord += a.charAt(i);
		}
		return reversedWord;
	}
	
	public String reverse(String s){
		
		String[] helper = s.split(" ");
		
		String reversedString = "";
		
		for(int i=helper.length-1;i>=0;i--){
			
			reversedString += reverseWord(helper[i])+" ";
		}
		return reversedString;
	}
	
	public static void main(String[] args) {
		
		// Reverse order of Words in a String and also reverse the Individual words
		
		String s = "Hello my name is Khan and I am not a terrorist";
		
		ReverseWords obj = new ReverseWords();
		
		String reversedString = obj.reverse(s);
		System.out.println(" Reversed String is  =  "+reversedString);
	}
	
}
