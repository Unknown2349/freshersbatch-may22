package com.lambdaexpressionsassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Removeodd {

	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<String>(
	                Arrays.asList("a","abbb","abc", "ab", "cde", "defg", "abcd", "eee"));      
	         
	        Predicate<String> filter = str -> (str.length()%2==1);
	         
	        System.out.println("Original ArrayList          : " + arrayList);
	        boolean value = arrayList.removeIf(filter);
	        System.out.println("Returned value : " + value);
	        System.out.println("ArrayList after removeIf()  : " + arrayList);
	    }
	}