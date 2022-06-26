package com.junitassignment3;
public class BankTest {

	public static void main (String args[]) throws InsufficientFundsException {
       
        Account acct = new Account(19000);
        System.out.println("Current balance : " + acct.getBalance());
        System.out.println("Withdrawing 21000");
        acct.withdraw(21000);
}
}
