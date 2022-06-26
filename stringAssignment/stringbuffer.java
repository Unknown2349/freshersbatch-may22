package com.stringAssignment;

public class stringbuffer {
		public static void main(String[] args)
		{
			StringBuffer st = new StringBuffer("String Buffer");
			st.append("is a peer class of String");
			st.append("that provides much of");
			st.append("the functionality of strings");
			System.out.println(st);
			
			StringBuffer st1 = new StringBuffer("it is used to at the specified index position");
			st1.insert(14, "insert text ");
			System.out.println(st1);
		
			System.out.println(	st1.reverse());
		}

	}
