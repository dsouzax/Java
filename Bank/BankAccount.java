package com.company.Bank;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int deposit(int depositAmount){
        return this.balance += depositAmount;
    }

    public int withdraw(int withdrawAmount){
        if (withdrawAmount > balance){
            System.out.println("Insufficient Balance");
            return -1;
        }
        return this.balance -= withdrawAmount;
    }


}

