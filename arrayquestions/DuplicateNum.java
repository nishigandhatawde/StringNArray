package com.arrayquestions;
//q2)WAP to find duplicate numbers and there counting from list of numbers.
public class DuplicateNum {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,3,5,2,6};
	int count=0;
	System.out.println("dupliacte number:");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count+=1;
				System.out.println(arr[j]);
				
			}
			
		}
		
	}
	System.out.println("count of duplicate num:"+count);
}
}
