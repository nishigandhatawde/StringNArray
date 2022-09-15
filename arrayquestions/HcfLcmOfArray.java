package com.arrayquestions;
//q7)WAP to find the LCM and HCF of array numbers.
public class HcfLcmOfArray {
public static void main(String[] args) {
	int arr[]= {20,36,48,50,66,75,84};
	int lcm=0;
	int hcf=0;
	int num=0;
	int min,max=0;
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				min=arr[j];
				max=arr[i];
			}else {
				min=arr[i];
				max=arr[j];
				
			}
			for(int k=0;k<arr.length;k++) {
				num=k+max;
				if(num%min==0) {
					lcm=num;
				}
			}

		}
	}
	System.out.println("lcm of the given array of number:"+lcm);	
}
}
