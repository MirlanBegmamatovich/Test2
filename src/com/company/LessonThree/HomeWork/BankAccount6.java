package com.company.LessonThree.HomeWork;

public class BankAccount6 {
    int id;
    String name;
    double balance;
    public static void main(String[] args){
        BankAccount6 aF = new BankAccount6();
        aF.id = 6;
        aF.name = "Baidoolot";
        aF.balance = 1000000000;
        System.out.println("id пользователя "+aF.id);
        System.out.println("имя пользователя "+aF.name);
        System.out.println("Баланс пользователя "+aF.balance+"долларов");

    }
}
