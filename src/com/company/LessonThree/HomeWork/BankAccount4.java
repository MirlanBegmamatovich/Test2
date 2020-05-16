package com.company.LessonThree.HomeWork;

public class BankAccount4 {
    int id;
    String name;
    double balance;
    public static void main(String[] args){
        BankAccount4 aD = new BankAccount4();
        aD.id = 4;
        aD.name = "Iskhaq";
        aD.balance = 10000000;
        System.out.println("id пользователя "+aD.id);
        System.out.println("имя пользователя "+aD.name);
        System.out.println("Баланс пользователя "+aD.balance+"долларов");

    }
}
