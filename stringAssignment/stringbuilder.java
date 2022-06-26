package com.stringAssignment;

public class stringbuilder 
{
	public static void main(String[] args) 
	{
		StringBuilder st1 = new StringBuilder("String Builder");
		st1.append(" is a peer class of String");
		st1.append("that provides much of");
		st1.append(" the functionality of strings");
		System.out.println(st1);
		
		StringBuilder st2 = new StringBuilder("it is used to at the specified index position");
		st2.insert(14, "insert text ");
		System.out.println(st2);
	
		System.out.println(	st2.reverse());
	}



}
