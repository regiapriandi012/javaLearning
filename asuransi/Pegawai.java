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
public class Pegawai {
    protected String NIP;
    protected String Nama;
    protected String Alamat;
    protected int TahunMasukKerja;
    protected int gajiPokok;
    protected double gajiAkhir;
    
    public Pegawai(String Nm,String NIP,String Almt,int ThMskKer,int gajiPokok){
        this.NIP=NIP;
        Nama=Nm;
        Alamat=Almt;
        TahunMasukKerja=ThMskKer;
        this.gajiPokok=gajiPokok;
    }

    public void cetak(){
        System.out.println("Nama Pegawai     : "+Nama);
        System.out.println("NIP Pegawai      : "+NIP);
        System.out.println("Alamat Pegawai   : "+Alamat);
        System.out.println("Tahun Masuk Kerja: "+TahunMasukKerja);
        System.out.println("Gaji Pokok       : "+gajiPokok);
    }
}