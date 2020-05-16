package com.company.LessonThree.HomeWork;

public class BankAccount5 {
    int id;
    String name;
    double balance;
    public static void main(String[] args){
        BankAccount5 aE = new BankAccount5();
        aE.id = 5;
        aE.name = "Syrgaq";
        aE.balance = 1000000000;
        System.out.println("id пользователя "+aE.id);
        System.out.println("имя пользователя "+aE.name);
        System.out.println("Баланс пользователя "+aE.balance+"долларов");

    }
}
