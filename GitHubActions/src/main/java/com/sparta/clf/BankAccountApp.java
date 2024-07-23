package com.sparta.clf;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);
        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println("Current balance: " + myAccount.getBalance());
        // this is a comment
        // I have added another comment at Cathy's request
    }
}
