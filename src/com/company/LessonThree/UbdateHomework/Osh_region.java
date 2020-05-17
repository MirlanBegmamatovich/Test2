package com.company.LessonThree.UbdateHomework;

public class Osh_region {
    int id;
    String region;
    double area;
    double population;
    public static void main (String[] args){

        Osh_region Chon_Alay = new Osh_region();
       Chon_Alay.id = 1;
       Chon_Alay.region = "Чон-Алайский район";
       Chon_Alay.area = 4860;
       Chon_Alay.population = 24500;

        System.out.println("id района "+Chon_Alay.id);
        System.out.println("Наименование  "+Chon_Alay.region);
        System.out.println("Площадь  "+Chon_Alay.area);
        System.out.println("Население  "+Chon_Alay.population);
        System.out.println("");

        Osh_region Alay = new Osh_region();
        Alay.id = 2;
        Alay.region = "Алайский район";
        Alay.area = 7582;
        Alay.population = 72170;

        System.out.println("id района " +Alay.id);
        System.out.println("Наименование  " +Alay.region);
        System.out.println("Площадь  " +Alay.area);
        System.out.println("Население  " +Alay.population);
        System.out.println("");

        Osh_region Aravan = new Osh_region();
        Aravan.id = 3;
        Aravan.region = "Араванский район";
        Aravan.area = 1340;
        Aravan.population = 106134;

        System.out.println("id района " +Aravan.id);
        System.out.println("Наименование  " +Aravan.region);
        System.out.println("Площадь  " +Aravan.area);
        System.out.println("Население  " +Aravan.population);
        System.out.println("");

        Osh_region Kara_Kulja = new Osh_region();
        Kara_Kulja.id = 4;
        Kara_Kulja.region = "Кара-Кулжинский район";
        Kara_Kulja.area = 5712;
        Kara_Kulja.population = 87691;

        System.out.println("id района " +Kara_Kulja.id);
        System.out.println("Наименование  " +Kara_Kulja.region);
        System.out.println("Площадь  " +Kara_Kulja.area);
        System.out.println("Население  " +Kara_Kulja.population);
        System.out.println("");

        Osh_region Kara_Suu = new Osh_region();
        Kara_Suu.id = 5;
        Kara_Suu.region = "Кара-Суйский район";
        Kara_Suu.area = 3616;
        Kara_Suu.population = 348645;

        System.out.println("id района " +Kara_Suu.id);
        System.out.println("Наименование  " +Kara_Suu.region);
        System.out.println("Площадь  " +Kara_Suu.area);
        System.out.println("Население  " +Kara_Suu.population);
        System.out.println("");

        Osh_region Nookat = new Osh_region();
        Nookat.id = 6;
        Nookat.region = "Ноокатский район";
        Nookat.area = 3179;
        Nookat.population = 236455;

        System.out.println("id района " +Nookat.id);
        System.out.println("Наименование  " +Nookat.region);
        System.out.println("Площадь  " +Nookat.area);
        System.out.println("Население  " +Nookat.population);
        System.out.println("");

        Osh_region Uzgen = new Osh_region();
        Uzgen.id = 7;
        Uzgen.region = "Узгенский район";
        Uzgen.area = 3400;
        Uzgen.population = 228114;

        System.out.println("id района " +Uzgen.id);
        System.out.println("Наименование  " +Uzgen.region);
        System.out.println("Площадь  " +Uzgen.area);
        System.out.println("Население  " +Uzgen.population);
        System.out.println("");

        Osh_region Osh_region = new Osh_region();
        Osh_region.id = 00;
        Osh_region.region = "Ошская область";
        Osh_region.area = Chon_Alay.area+Nookat.area+Uzgen.area+Aravan.area+Alay.area+Kara_Kulja.area+Kara_Suu.area;
        Osh_region.population = Alay.population+Aravan.population+Kara_Kulja.population+Kara_Suu.population+Nookat.population+Uzgen.population+Chon_Alay.population;

        System.out.println("id Области " +Osh_region.id);
        System.out.println("Наименование  " +Osh_region.region);
        System.out.println("Площадь  " +Osh_region.area);
        System.out.println("Население  " +Osh_region.population);
        System.out.println("");

        boolean a = Chon_Alay.population>Alay.population;
        System.out.println(a);




    }
}
