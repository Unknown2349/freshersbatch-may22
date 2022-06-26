package com.lambdaexpressionsassignment;

import java.util.function.Supplier;

public class Supply {


	    public static void main(String[] args) {
	        int n = 3;
	        display(() -> n + 10);
	        display(() -> n + 100);
	    }

	    static void display(Supplier<Integer> arg) {
	        System.out.println(arg.get());
	    }
	}