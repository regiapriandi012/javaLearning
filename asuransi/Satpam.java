/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asuransi;

/**
 * 
 * Nama  : Melinta Nurul Islam
 * NIM   : 19102092
 * Kelas : S1-IF-07-P
 * 
 */
public class Satpam extends Pegawai {
    private final int jamLembur;
    private int bonus;
    
    public Satpam(String Nm,String NIP,String Almt,int ThMskKer,int gajiPokok,int jamLembur){
        super(Nm,NIP,Almt,ThMskKer,gajiPokok);
        this.jamLembur=jamLembur;
    }
    public void cetakSatpam(){
        System.out.println("");
        System.out.println("**Satpam**");
        super.cetak();
        bonus = jamLembur * 10000;
        gajiAkhir = gajiPokok+bonus;   
        System.out.println("Jam Lembur       : "+jamLembur);
        System.out.println("Gaji Akhir       : "+gajiAkhir);
    }
}
    

