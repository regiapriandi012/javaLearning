/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.helloworld;

/**
 *
 * @author regia
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1.Hello World
        System.out.println("Hello World");
        System.out.println("");
        
        // 2. Keliling Lingkaran
        double pi = 3.1416;
        double r = 2.12;
        double keliling;
        keliling = 2 * pi * r;
        System.out.println("Keliling lingkaran = " +keliling);
        System.out.println("");
        
        //Blangan Bereksi
        Bilangan b1 = new Bilangan(50);
        b1.info();
        
        Bilangan b2 = new Bilangan(15);
        b2.info();
        
        Bilangan b3 = new Bilangan(30);
        b3.info();
        
        //karakter
        char karakter1 = 88, karakter2='X', karakter3='Y';
        
        System.out.println(karakter1);
        System.out.println(karakter2);
        System.out.println(karakter3);
    }
    
}
