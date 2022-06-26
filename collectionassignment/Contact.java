package com.collectionassignment;

import java.util.TreeMap;

public class Contact implements Comparable<Contact>
	{
	    Long phoneNumber;
	    String name;
	    String email;
		char gender;
		public Contact(long phoneNumber, String name, String email, char gender) 
		{
			super();
			this.phoneNumber = phoneNumber;
			this.name = name;
			this.email = email;
			this.gender = gender;
		}
		@Override
		public String toString()
		{
			return "PhoneNumber:"+phoneNumber+" Name:"+name+" Email:"+email+" Gender:"+gender;
		}
		@Override
		public int compareTo(Contact o) 
		{
			return  this.phoneNumber.compareTo(o.phoneNumber);
		}
		public static void main(String[] args) 
		{
			Contact c1=new Contact(123456789, "wand", "wand@123",'M' );
			Contact c2=new Contact(987654321, "Hussain", "Hussain@123",'M' );
			Contact c3=new Contact(456123789, "Unknown", "Unknown@654",'F' );
			TreeMap<Long, Contact> t=new TreeMap<>();
			
			t.put((long)123456789,c1);
			t.put((long)987654321,c2 );
			t.put((long)456123789,c3 );
			
			System.out.println(t.keySet());
			System.out.println(t.values());
			System.out.println(t);
		}
	}
