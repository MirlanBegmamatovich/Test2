package com.company.LessonTwo;

public class LogicOperations {
    public static void main(String[] args){
        boolean a =  false;
        boolean b =  true;
        boolean c =  true;
        boolean result = a && b && c;
        System.out.println("Оператор && (и) ->" + result);
        System.out.println("");

        boolean result1 = a || b || c;

        System.out.println("Оператор || (и) ->" + result1);
        System.out.println("");

        System.out.println(!a);
        System.out.println("");

        int a1 = 10;
        int b1 = 10;
        int c1 = 10;
        int d = 100;
        boolean e = a1 < b1 && c1 ==d; //true && false
        boolean e1 = a1 < b1 || c1 ==d; //true && false
        System.out.println(e);
        System.out.println(e1);
        System.out.println("");

        int a2 = 10;
        int b2 = 5;
        System.out.println(a2&b2);
        System.out.println(a2|b2);
        System.out.println("");

        boolean b3 = true;
        boolean b4 = true;
        boolean b5 = true;
        boolean b6 = true;
        System.out.println(b3^b4^b5^b6);
        boolean b7 = true;
        boolean b8 = false;
        boolean b9 = true;
        boolean b10 = true;
        System.out.println(b7^b8^b9^b10);

    }
}
