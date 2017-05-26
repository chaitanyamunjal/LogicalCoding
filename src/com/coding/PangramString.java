package com.coding;

public class PangramString {

	public boolean checkPangram(String s){
		
		int[] arr = new int[26];
		int index = 0;

		for(int i = 0;i < s.length() ;i++){
			if( 'A' <= s.charAt(i)  && s.charAt(i) <= 'Z'){
				index = s.charAt(i) -'A';
			}
			else if( 'a' <= s.charAt(i)  && s.charAt(i) <= 'z'){
				index = s.charAt(i) -'a';
			}
			arr[index] = 1;
			
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String s1 = "The quick brown fox jumps over the doG";
		String s2 = "The quick brown fox jumps over the lazy dog ";
		
		PangramString obj = new PangramString();
		if(obj.checkPangram(s1)){
			System.out.println(" Pangram 1 !!");
		}
		else{
			System.out.println(" NOT Pangram 1 !!");
		}
		
		if(obj.checkPangram(s2)){
			System.out.println(" Pangram 2 !!");
		}
		else{
			System.out.println(" NOT Pangram 2 !!");
		}
		
	}

}
