package com.coding;

public class Sort012array {

	
	void swap(int a , int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public void sort(int arr[]){
		
		int low = 0, mid = 0, high = arr.length-1;
		
		while( mid < high)
		{
			if(arr[mid] == 0)
			{
				swap(arr[mid],arr[low]);
				mid++;
				low++;
			}
			else if(arr[mid] == 1)
			{
				mid++;
			}
			else
			{
				swap(arr[mid],arr[high]);
				high--;
			}
		}
		
		for(int i = 0; i < arr.length ; i++ )
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
	    
	    Sort012array obj = new Sort012array();
	    obj.sort(arr);
		
	}

}
