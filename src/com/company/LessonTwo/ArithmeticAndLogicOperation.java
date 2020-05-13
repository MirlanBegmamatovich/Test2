package com.company.LessonTwo;

public class ArithmeticAndLogicOperation {
    public static void main(String[] args){
        int a = 10;
        int b = a;
        System.out.println("a ровнялся к a (тоесть a присвоено к b");
        System.out.println("");

        // Начало арифметических операции типы данных
        int a1 = 20;
        int a2 = 30;
        int a3 = a1 + a2;
        int a4 = a1 - a2;
        int a5 = a1 * a2;

        double d = 20; //пример деление с использованием double
        double d1 = 30; //пример деление с использованием double
        double a6 = d/d1;
        int nonDouble = 20; // пример деление с использованим без double
        int nonDouble1 = 30; // пример деление с использованим без double
        int summa = nonDouble / nonDouble1;
        double summa1 = nonDouble / nonDouble1;

        System.out.println("Первый пример прибавление (a1 + a2)->" +(a1 + a2));
        System.out.println("Пример прибавляется (a1 + a2) -> " +  a1 + a2 + " Но здесь две значение типы данных не прибавляется" +
                "потому что здесь просто отображается типы данных");
        System.out.println("Второй пример прибавление (a1+a2) ->"+ a3);
        System.out.println("Третий пример отнимание (a1-a2) ->"+ a4);
        System.out.println("Четвертый пример умножение (a1*a2) ->"+ a5);
        System.out.println("Пятый  пример деление c использованием double (d / d1) -> " +  a6);
        System.out.println("Пятый  пример деление без использованием double (noneDoble / noneDoble1) -> " +  summa);
        System.out.println("Пятый  пример деление c использованием  double (noneDoble / noneDoble1) -> " +  summa1);

        int chast = 11;
        int chast1 = 5;
        int celaya = chast / chast1;
        int ostatok = chast % chast1;
        System.out.println("Целая часть ->" + celaya);
        System.out.println("Остаток ->" + ostatok);

    }
}
