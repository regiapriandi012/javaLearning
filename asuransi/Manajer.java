/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asuransi;

/**
 *
 * @author MyPC
 */
public class Manajer extends Pegawai {
    private String divisi;
    private double tunjJabatan;
    
    public Manajer(String Nm,String NIP,String Almt,int ThMskKer,int gajiPokok, String divisi){
        super(Nm,NIP,Almt,ThMskKer,gajiPokok);
        this.divisi=divisi;
    }
    public void cetakManajer(){
        System.out.println("");
        System.out.println("**Manajer**");
        super.cetak();
        if (2015-TahunMasukKerja>=3 && 2015-TahunMasukKerja<5){
            tunjJabatan = 0.05*gajiPokok;
        }
        else if(2015-TahunMasukKerja>=5){
            tunjJabatan= 0.1*gajiPokok;
        }
        gajiAkhir = gajiPokok + tunjJabatan;
        System.out.println("Divisi           : " + divisi);
        System.out.println("Gaji Akhir       : " + gajiAkhir);
    }
}
