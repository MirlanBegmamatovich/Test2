package com.company.LessonThree.HomeWork;

public class BankAccount3 {
    int id;
    String name;
    double balance;
    public static void main(String[] args){
        BankAccount3 aC = new BankAccount3();
        aC.id = 3;
        aC.name = "Aiym";
        aC.balance = 10000000;
        System.out.println("id пользователя "+aC.id);
        System.out.println("имя пользователя "+aC.name);
        System.out.println("Баланс пользователя "+aC.balance+"долларов");

    }
}
