package com.stringquestions;
//q7)WAP to demonstrate how garbage collector work when any memory is not 
//referenced by string object.
public class GarbageCollectorWork {
public static void main(String[] args) {
	String s1=new String("good");
	String s2=new String("");
	String s3="afternoon";
	String s4="";
	System.gc();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
}
}
