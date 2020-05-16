package com.company.LessonThree.HomeWork;

public class BankAccount1 {
    int id;
    String name;
    double balance;

    public static void main(String[] args){
        BankAccount1 aA = new BankAccount1();
        aA.id = 1;
        aA.name = "Mirlan";
        aA.balance = 1000000000;
        System.out.println(" ID пользователя" +aA.id);
        System.out.println("Имя пользователя" +aA.name);
        System.out.println("Баланс пользователя" aA.balance+"долларов");
    }
}
