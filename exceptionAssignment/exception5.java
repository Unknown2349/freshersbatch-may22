package com.exceptionAssignment;

import java.util.Scanner;


public class exception5 {

	static double balance=2000;
	
	public static void main(String[] args) throws savingAccount {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdrawn");
		int n=sc.nextInt();
		try {
			if(balance<n) {
				throw new savingAccount("InsufficientBalanceException " +balance);
			}
			if(n<0) {
				throw new savingAccount("IllegalBankTransactionException");
			}
			else {
				System.out.println("Please collect your money!");
			}
		}
		catch(savingAccount mab) {
			mab.printStackTrace();
		}
		
	}

}