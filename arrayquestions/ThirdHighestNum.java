package com.arrayquestions;
//q1)WAP to find third maximum number from list of numbers.
public class ThirdHighestNum {
public static void main(String[] args) {
	int arr[]= {5,6,7,3,2,4,10};
	int length=arr.length;
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}System.out.println("third highest number of given array:"+arr[length-3]);
}
}
