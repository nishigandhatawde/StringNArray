package com.arrayquestions;
//q10)You are having array of strings. Now you have to arrange strings in array on the basis of the length of each string. 
//Smallest string will be first and so on.
public class SmallestStringFirst {
public static void main(String[] args) {
	String [] a = {"hi", "hello", "goodmorning", "goodnight","sweetdream"};
    String temp="";
    System.out.println("String series smallest to longest : ");
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
        if(a[i].length()>a[j].length())
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        
        }
        System.out.println(a[i]);
    }
}
}
