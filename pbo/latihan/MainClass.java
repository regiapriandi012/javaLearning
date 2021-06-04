/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.latihan;

import java.util.Scanner;
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
        int diskon, totalBelanja;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Total Belanja: ");
        totalBelanja = input.nextInt();
        
        //if else
        if (totalBelanja >= 100000){
            diskon = totalBelanja / 10;
            
            System.out.println("Diskonnya adalah: " + diskon);}
        else{
            System.out.println("Tidak ada diskon!");
        }
        //--------------------------------------------------------------
        //switch case
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan nilai: ");
        int nilaiUjian = in.nextInt();
        
        switch(nilaiUjian/10){
            case 10:
                System.out.println("nilai = A");
                break;
            case 9:
                System.out.println("nilai = A");
                break;
            case 8:
                System.out.println("nilai = B");
                break;
            case 7:
                System.out.println("nilai = C");
                break;
            default:
                System.out.println("nilai = D");
            
        }
    }
    
}
