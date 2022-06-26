package com.spring.assign8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Post {

	
	
	    public static void main( String[] args )
	    {
	    	ConfigurableApplicationContext context = 
	    	  new ClassPathXmlApplicationContext(new String[] {"prp.xml"});
		
	    	CustomerService cust = (CustomerService)context.getBean("customerService");
	    	
	    	System.out.println(cust);
	    	
	    	context.close();
	    }
	}