package com.genericsAssignment;

import java.util.HashSet;
import java.util.Set;

public class Employeedetails {


	    private int empId;
	    private String empName;
	    private double empSalary;
	    private String empDepartment;

	    public Employeedetails(int empId, String empName, double empSalary,String empDepartment) {
	        super();
	        this.empId = empId;
	        this.empName = empName;
	        this.empSalary = getEmpSalary();
	        this.empDepartment = empDepartment;
	    }

	    public Employeedetails(int i, String string) {
			// TODO Auto-generated constructor stub
		}

		/**
	     * @return the empId
	     */
	    public final int getEmpId() {
	        return empId;
	    }

	    /**
	     * @param empId
	     *            the empId to set
	     */
	    public final void setEmpId(int empId) {
	        this.empId = empId;
	    }

	    /**
	     * @return the empName
	     */
	    public final String getEmpName() {
	        return empName;
	    }

	    /**
	     * @param empName
	     *            the empName to set
	     */
	    public final void setEmpName(String empName) {
	        this.empName = empName;
	    }

	    /*
	     * (non-Javadoc)
	     * 
	     * @see java.lang.Object#toString()
	     */
	    @Override
	    public String toString() {
	        return "Employee [empId=" + empId + ", empName=" + empName + "]";
	    }

	    @Override
	    public int hashCode() {
	        return this.empId;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        Employeedetails employee = (Employeedetails) obj;
	        if (employee.empId == this.empId) {
	            employee.setEmpName(this.empName);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Set<Employeedetails> employees = new HashSet<>();
	        employees.add(new Employeedetails(1, "Raj"));
	        employees.add(new Employeedetails(1, "Pradeep"));
	        employees.add(new Employeedetails(1, "Kumar"));
	        employees.add(new Employeedetails(2, "Chandan"));
	        employees.add(new Employeedetails(2, "Amitava"));

	        System.out.println(employees);
	    }

		public double getEmpSalary() {
			return empSalary;
		}

		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}

		public String getempDepartment() {
			return empDepartment;
		}

		public void setEmpDepartment(String empDepartment) {
			this.empDepartment = empDepartment;
		}
	}