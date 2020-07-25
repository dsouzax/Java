package com.company.Bank;

public class Main {

    public static void main(String[] args) {

        BankAccount sam = new BankAccount(13456, 10000, "Sam", "sam@mail.com", 13455667);

        sam.deposit(2000);
        System.out.println(sam.getBalance());

        sam.withdraw(4000);
        System.out.println(sam.getBalance());

        sam.withdraw(12000);
        System.out.println("Balance remaining: " +sam.getBalance());

    }
}
