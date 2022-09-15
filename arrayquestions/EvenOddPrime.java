package com.arrayquestions;
//q5)An Array Contain different numbers you have to find how many are even, 
//odd, perfect and prime
public class EvenOddPrime {
public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7,8,9,10,11,12};
	int counteven=0;
	int countodd=0;
	int countprime=0;
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]%2==0) {
			counteven+=1;
			
		}else {
			countodd+=1;
			
			
		}
		
		
	}
	System.out.println("even number count:"+counteven);
	System.out.println("odd number count:"+countodd);
	
	int sum=0;
	
	for(int j=2;j<arr.length;j++) {
		if(arr[j]%2!=0) {
			countprime+=1;
		}
	}System.out.println("count of prime number:"+countprime);
	
	for(int k=1;k<arr[k]/2;k++) {
		if(arr[k]%k==0) {
			sum=sum+k;
		}
		System.out.println("perfect number:"+arr[k]);
	}
	
}
}
