package com.genericsAssignment;

import java.util.HashSet;

public class Employee {
		int id;
		String name;
		double salary;
		String department;
		public Employee(int id, String name, double salary, String department)
		{
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.department = department;
		}
		public void displayDetails(int id,String name,double salary,String department)
		{
			System.out.println("\nId:"+id +"\nName:" + name+"\nSalary:" + salary +"\nDepartment:"+department);
		}
		public String toString()
		{
			return "\nId:"+id +"\nName:" +name+"\nSalary:" + salary +"\nDepartment:"+department;
		}

		public static void main(String[] args) 
		{
			Employee e1 = new Employee(1233,"wand",10000.00,"cs");
			Employee e2 = new Employee(1222,"unknown",15000.00,"ec");
			Employee e3 = new Employee(1256,"noname",19221.00,"ee");

			e1.displayDetails(1233,"wand",10000.00,"cs");
			e2.displayDetails(1222,"unknown",15000.00,"ec");
			e3.displayDetails(1256,"noname",19221.00,"ee");

			HashSet<Employee> h = new HashSet<Employee>();
			h.add(e1);
			h.add(e2);
			h.add(e3);

			for(Employee obj:h)
			{
				System.out.println(obj);
			}

		}
	}
