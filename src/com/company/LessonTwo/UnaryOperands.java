package com.company.LessonTwo;

public class UnaryOperands {
    public static void main(String[] args) {

    int a = 5;
    int b = 3;
    int c = a - b;//простое арифметические отнимание
    int c1 = a - b++;
    System.out.println("простое арифметические отнимание " + c);
    System.out.println("Использование постфикс (b++) " + c1);
    System.out.println("после исользование постфикса (b++) переменная стало цифру 4 -> " + b);
    System.out.println("");

    int a1 = 5;
    int b1 = 3;
    int c2 = a1 - ++b1;
    System.out.println("Использование префикса -> " + c2);
    }
}
