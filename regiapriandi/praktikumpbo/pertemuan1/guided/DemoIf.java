package com.regiapriandi.praktikumpbo.pertemuan1.guided;

import java.util.Scanner;

public class DemoIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Bilangan: ");
        int bill = input.nextInt();
        
        if (bill > 0){
            System.out.println(bill + " adalah bilangan positif");      
        } 
        else if (bill < 0){
            System.out.println(bill + " adalah bilangan negatif");
        }
        else {
            System.out.println(bill + " bilangan adalah nol");
        }
    }   
}
