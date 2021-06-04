/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asuransi;

/**
 *
 * Nama : Melinta Nurul Islam
 * NIM  : 19102092
 * Kelas: S1-IF-07-P
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Satpam S = new Satpam("Rendra","0042","Jl. Itik 15",2000,300000,5);
        Sales T = new Sales("Wibisana","0185","Jl. Ayam 78",2006,500000,10);
        Manajer M = new Manajer("Adi","0005","Jl. Angsa 56" ,1999 ,1500000 ,"Keuangan");
        
        System.out.println("\n\n==DISPLAY DATA KARYAWAN==");
        S.cetakSatpam();
        T.cetakSales();
        M.cetakManajer();

    }
    
}
