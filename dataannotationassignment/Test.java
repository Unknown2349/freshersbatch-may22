package com.dataannotationassignment;



	import java.lang.annotation.Documented;
	import java.lang.annotation.Inherited;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;
	import java.lang.annotation.ElementType;

	@Documented
	@Target(value=ElementType.METHOD) 
	@Inherited
	@Retention(RetentionPolicy.RUNTIME) 

		public @interface Test{ 

		    String name(); 

		  

		    Class< ?> type(); 

		  

		    boolean isPrimaryKey() default false; 
		}