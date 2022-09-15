package com.arrayquestions;

//q4)An Array contain the n numbers you have to find out combination which satisfy Pythagoras Template. 
//( Pythagoras templates:- 3*3+4*4==5*5)
public class PythagorasTheorem {
	public static void main(String[] args) {
		int arr[] = { 6, 8, 10 };
		for (int i = 0; i < arr.length-2; i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=i+2;k<arr.length;k++) {
					if(arr[i]*arr[i]+arr[j]*arr[j]==arr[k]*arr[k]) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
					else {
						System.out.println("not follows the Pythagoras concept ");
					}
				}
			}
		}
	}
}
