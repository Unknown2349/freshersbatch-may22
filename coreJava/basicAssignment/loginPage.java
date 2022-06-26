package com.coreJava.basicAssignment;

import java.util.Scanner;

public class loginPage {

		public static void main(String[] args) {
			String userName ="Prashant Patil";
			String _name = "prashant2571.pp@gmail.com";
			
			String _password = "prash123";
			
			Scanner sc = new Scanner(System.in);
			
			
			for(int i=1;i<=3;i++) {
				
				System.out.println("Enter Login ID :");
				String name = sc.next();
				
				System.out.println("Enter the password :");
				String password = sc.next();
				
				if((_name.equals(name))&&(password.equals(_password))) {
					System.out.println("welcome Mr. "+userName);
					break;
				}else {
					if(i==3) {
						System.out.println("Contact Admin");
					}else {
						System.out.println("Sorry! try again");
					}
				}
			}	
		}

	}
