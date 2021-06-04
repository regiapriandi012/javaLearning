package com.regiapriandi.praktikumpbo.pertemuan1.unguided;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan bilangan: ");
        int bilbul = input.nextInt();
        
        if (bilbul % 2 == 0){
            System.out.println(bilbul + " Merupakan bilangan Genap!");
        }
        else {
            System.out.println(bilbul + " Merupakan bilangan Ganjil!");
        }
    }
}
