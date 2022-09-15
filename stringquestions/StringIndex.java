package com.stringquestions;

//q1)Create a program in which two string is input by the user and after that user will 
//enter index in first string where we want to insert the second 
//string and insert the second string at that index and create a new string
public class StringIndex {
	public static void main(String[] args) {
		String first = "nishi";
		String second = "tawde";
		String concatString = "";
		int index = 2;
		for(int i=0;i<first.length();i++) {
			concatString=concatString+first.charAt(i);
			if(i==index) {
				concatString=concatString+second;
			}
		}
		System.out.println(concatString);
	}
}
