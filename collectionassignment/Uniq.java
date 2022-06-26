package com.collectionassignment;

import java.util.TreeSet;

public class Uniq {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("DC");
		t.add("KKR");
		t.add("MI");
		t.add("CSK");
		t.add("RCB");
		t.add("LSG");
		t.add("GT");
		t.add("SRH");
		t.add("PBKS");
		t.add("RR");
		t.add("KTK");

		for(String i : t) {
			System.out.println(i);
		}
	}

}
