package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean {





	        public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		     // Tri triangle = (Tri) context.getBean("tri");
		      Tri triangle = context.getBean(Tri.class);
		      triangle.draw();
	         }

	}