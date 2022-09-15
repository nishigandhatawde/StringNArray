package com.arrayquestions;
//q8)You are given a sequence of Character in the form of Array. 
//Now you have to put all vowels and consonants together in the array.
public class VowelsConsonants {
	public static void main(String[] args) {
		char[] arr= {'n','i','s','h','i','g','a','n','d','h','a'};
		String vowels="";
		String consonants="";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='a'|| arr[i]=='e'||arr[i]=='i'|| arr[i]=='o'||arr[i]=='u') {
				vowels=vowels+arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!='a'&& arr[i]!='e'&&arr[i]!='i'&& arr[i]!='o'&&arr[i]!='u') {
				consonants=consonants+arr[i];
			}
		}
		System.out.println("vowels in given strings are: "+vowels);
		System.out.println("consonants in given strings are: "+consonants);
		
	}
}
