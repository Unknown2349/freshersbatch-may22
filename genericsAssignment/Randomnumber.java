package com.genericsAssignment;

import java.util.HashMap;

public class Randomnumber {

	
	public static void main(String[] args) {

		HashMap<Integer, Double> h = new HashMap<Integer, Double>();
		
		// put() is used to add key and value inside Map
		h.put(10, 22.43);
		h.put(20, 20.55);
		h.put(30, 25.23);
		h.put(40, 26.35);
		h.put(50, 26.43);
		h.put(60, 27.55);
		h.put(70, 28.88);
		h.put(80, 29.95);
		h.put(90, 29.75);
		h.put(100,30.22);
		System.out.println(h);
}
}
