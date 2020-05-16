package com.company.LessonThree;

public class BankAccount {

    int id ;
    String name;
    double balance;

    public static void main (String [] args) {
        BankAccount bA = new BankAccount();
        bA.id = 1;
        bA.name = "Рустам";
        bA.balance = 1000500;

        System.out.println("id пользователя "+bA.id);
        System.out.println("имя пользователя "+bA.name);
        System.out.println("Баланс пользователя "+bA.balance + "долларов");
    }
}
