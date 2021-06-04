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
public class Sales extends Pegawai{
    private int jmlPelanggan;
    private int komisi;
  
    public Sales(String Nm,String NIP,String Almt,int ThMskKer,int gajiPokok,int jmlPelanggan){
        super(Nm,NIP,Almt,ThMskKer,gajiPokok);
        this.jmlPelanggan=jmlPelanggan;
    }
    public void cetakSales(){
        System.out.println("");
        System.out.println("**Sales**");
        super.cetak();
        komisi = jmlPelanggan * 50000;
        gajiAkhir = gajiPokok+komisi;   
        System.out.println("Jumlah Pelanggan : "+jmlPelanggan);
        System.out.println("Gaji Akhir       : "+gajiAkhir);
    }
    
}

