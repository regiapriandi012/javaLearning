package com.bank;

public class Bank {
    //instance
    int saldo;
    //contructor
    public Bank(int saldo){
        this.saldo = saldo;
    }
    //method
    public void simpanUang(int uang){
        System.out.println("Simpan uang: Rp. " + uang);
        saldo += uang;
    }

    public void ambilUang(int uang){
        System.out.println("Simpan uang: Rp. " + uang);
        saldo -= uang;
    }

    public void getSaldo(){
        System.out.println("Saldo saat ini: Rp. " + saldo);
        System.out.println("");
    }

}
