package com.genericsAssignment;


public class Pair<T> 
{
   private T key;
   private T value;
   
public T getKey() 
{
	return key;
}

public void setKey(T key) 
{
	this.key = key;
}

public T getValue() 
{
	return value;
}

public void setValue(T value) 
{
	this.value = value;
}


public static void main(String[] args) 
   {
	  Pair<String> pair = new Pair<>();
	  pair.setKey("1");
	  pair.setValue("Hello");
	  String s1=pair.getKey();
	  String s2=pair.getValue();
	  System.out.println(s1);
	  System.out.println(s2);
	  
	  Pair<String> pair1 = new Pair<>();
	  pair1.setKey("Today is");
	  pair1.setValue("new java.util.Date()");
	  String s3=pair1.getKey();
	  String s4=pair1.getValue();
	  System.out.println(s3);
	  System.out.println(s4);
	  
	   
}
  
}
