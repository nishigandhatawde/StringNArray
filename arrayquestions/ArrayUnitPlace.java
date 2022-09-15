package com.arrayquestions;
//q12)WAP to sort array on the basis of unit place. 
//For example we are having following numbers:- 10,2,3,41,12,13,19,81,9. 
//Output will be 10,41,81,2,12,3,13,19,9.
public class ArrayUnitPlace {
public static void main(String[] args) {
	int arr[]= {10,2,3,41,12,13,19,81,9};
	for(int n=0; n<arr.length; n++) {
        for(int m=1+n; m<arr.length; m++) {
            if(arr[n]%10>arr[m]%10) {
                int temp = arr[n];
                arr[n]= arr[m];
                arr[m]=temp;
            }
        }
    }
    for(int k=0;k<arr.length;k++) {
        System.out.println(arr[k]);
    }
}
}
