package com.coding;

public class LeaderElement {

	static int k = 0;
	
	public int[] findLeader(int arr[]){
		
		int size =  arr.length;
		int leader[] = new int[size];
		
		leader[k] = arr[size-1];
	
		for(int i = size - 2 ; i >= 0 ; i--){
			
			if(leader[k] < arr[i] ){
				leader[k+1] = arr[i];
				k++;
			}
		}
		k++;
		return leader;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{16, 17, 4, 3, 5, 2, 1};
		
		LeaderElement obj = new LeaderElement();
		int leader[] = obj.findLeader(arr);
		
		System.out.println(" Leader Element found = ");
		for(int i=0; i < k ;i++){
			System.out.println(i+" = "+leader[i]);
		}
	}

}
