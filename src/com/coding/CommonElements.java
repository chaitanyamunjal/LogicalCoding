package com.coding;

public class CommonElements {

	public void FindCommon(int ar1[],int ar2[],int ar3[]){
		
		int i=0,j=0,k=0;
		while(i < ar1.length && j < ar2.length && k < ar3.length)
		{
			
			if( ar1[i] == ar2[j] && ar2[j] == ar3[k]){
				System.out.println(" "+ar1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(ar1[i] < ar2[j]){
				i++;
			}
			else if(ar2[j] < ar3[k]){
				j++;
			}
			else{
				k++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonElements obj = new CommonElements();
		 
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {1, 6, 7, 20, 80, 100};
        int ar3[] = {1, 3, 4, 15, 20, 30, 70, 80, 120};
 
        System.out.println("Common elements are ");
        obj.FindCommon(ar1, ar2, ar3);
		
	}

}
