package com.stringquestions;
//q2)WAP to print the all alphabets of string in ascending and descending order.
public class StringAscDscOrder {
	 public static void main(String[] args) {
	        String str = "nishi";
	        char arr[] = str.toCharArray();
	        System.out.println("Before sorting :");
	        for(int i=0; i<arr.length; i++) {
	            
	            System.out.print(arr[i]);
	            
	        }
	        System.out.println();
	        System.out.println("After sorting ascending :");
	        for(int j=0; j<arr.length;j++) {
	            for(int k=1+j; k<arr.length; k++) {
	                if(arr[j]>arr[k]) {
	                    char temp= arr[j];
	                    arr[j]=arr[k];
	                    arr[k]= temp;
	                    //System.out.print(arr[j]);
	                    
	                }
	            }
	            //System.out.println(arr[j]);
	            
	        }
	        
	        for(int l=0; l<arr.length; l++) {
	            System.out.print(arr[l]);
	        }
	        
	        System.out.println();
	        System.out.println("Descending :");
	        
	        for(int m=arr.length-1; m>=0; m--) {
	            System.out.print(arr[m]);
	        }
	    }
}
