package com.company.LessonTwo;

// Операторы присвоение
public class AssigmentOperators {
    public static void main(String[] arga){
        int a = 5; // присвоение через оператора =

    a += 10;
    System.out.println("Использование оператора(+=) -> "+a);
    System.out.println("");

    int b = 3; // Присвоение через оператора (=)
        b -= 1;
    System.out.println("Использование оператора (-=), ->"+b);
    System.out.println("");

    int c = 10;
    c*=10;
    System.out.println("Использование оператора (*=), ->"+c);
    System.out.println("");

    int d = 3;
    d /=3;
    System.out.println("Использование оператора (/=), ->"+d);
    System.out.println("");

    //Множественные присвоивание переменных

    int d1=10;
    int d2=3;
    int d3=5;
    d1 = d2 = d3 = 25;

    System.out.println("Множественные присвоивание переменных -> " + d1);
    System.out.println("Множественные присвоивание переменных -> " + d2);
    System.out.println("Множественные присвоивание переменных -> " + d3);
    }
}
