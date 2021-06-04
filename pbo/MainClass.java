package com.pbo;

public class MainClass {
    
    public static void main (String[] args) {
        // 1. Hello world
        System.out.println("Hello World");
        System.out.println("");

        // 2. Keliling Lingkaran
        double pi = 3.1416;
        double r = 2.12;
        double keliling;
        keliling = 2 * pi * r;
        System.out.println("Keliling lingkaran = " + keliling);
        System.out.println("");

        // 3. Bilangan Beraksi
        Bilangan b1 = new Bilangan(50);
        b1.info();

        Bilangan b2 = new Bilangan(15);
        b2.info();

        Bilangan b3 = new Bilangan(30);
        b3.info();

        // 4. Karakter
        char karakter1 = 88, karakter2 = 'X', karakter3 = 'Y';

        System.out.println(karakter1);
        System.out.println(karakter2);
        System.out.println(karakter3);
        System.out.println("");

        // 5. increment decrement
        int x = 30;
        int y, z, a, b;
        y = x++;
        z = ++x;
        a = x--;
        b = --x;

        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
