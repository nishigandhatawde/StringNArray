package com.arrayquestions;

//q9)User will enter the element in M*M order matrix that is square matrix now you have to print first row, 
//last row, first column, and last column elements. 
//Code should be applicable for matrix of any order.
public class MatrixIntoMatrix {
	public static void main(String[] args) {
		int n=4;
		int arr[][] = { { 1,2,3,4 }, { 5,6,7,8 }, { 9,10,11,12 } };
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n;j++) {
				if((i!=0&&j!=0)&&(i!=n-1&&j!=n-1)) {
					System.out.print(" ");
					continue;
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
