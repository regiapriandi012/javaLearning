package com.regiapriandi.praktikumpbo.pertemuan1.guided;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--> EDIT PROFILE <--");
        
        System.out.println("Masukan nama: ");
        String nama =  input.nextLine();
        
        System.out.println("Masukan inisial: ");
        char inisial = input.nextLine().charAt(0);
        
        System.out.println("Masukan Usia: ");
        int usia = input.nextInt();
        
        System.out.println("Masukan Tinggi Badan: ");
        float tinggi = input.nextFloat();
        
        System.out.println("");
        System.out.println("--> PROFIL SAYA <--");
        System.out.println("Nama: " + nama); 
        System.out.println("Inisial: " + inisial);
        System.out.println("Usia: " + usia);
        System.out.println("Tinggi: " + tinggi);
    }
}
