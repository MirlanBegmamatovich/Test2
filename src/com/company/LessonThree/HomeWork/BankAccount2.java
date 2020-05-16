package com.company.LessonThree.HomeWork;

public class BankAccount2 {
    int id;
    String name;
    double balance;

    public static void main(String[] args){
        BankAccount2 aB = new BankAccount2();
        aB.id = 2;
        aB.name = "Cholpon";
        aB.balance = 10000000;
        System.out.println("id пользователя "+aB.id);
        System.out.println("имя пользователя "+aB.name);
        System.out.println("Баланс пользователя "+aB.balance+"долларов");

    }
}
