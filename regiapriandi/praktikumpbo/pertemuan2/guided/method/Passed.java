package com.regiapriandi.praktikumpbo.pertemuan2.guided.method;

public class Passed {
    public static void main(String[] args) {
        TestPass tp = new TestPass(50, 100);
        int nomer1 = 10;
        int nomer2 = 20;

        //nilai sebelum pass by value
        System.out.println("nilai sebelum pass by value");
        System.out.println("nomer1: " + nomer1);
        System.out.println("nomer2: " + nomer2);

        tp.calculate(nomer1, nomer2);
        //nilai setelah pass by value
        System.out.println("nilai setelah pass by value");
        System.out.println("nomer1: " + nomer1);
        System.out.println("nomer2: " + nomer2);
        System.out.println();

        //nilai sebelum pass by reference
        System.out.println("nilai sebelum pas by reference");
        System.out.println("nomer1: " + tp.nomer1);
        System.out.println("nomer2: " + tp.nomer2);

        tp.calculate(tp);
        //nilai setelah pass by reference
        System.out.println("nilai setelah pass by reference");
        System.out.println("nomer1: " + tp.nomer1);
        System.out.println("nomer2: " + tp.nomer2);
        System.out.println();


    }
}
