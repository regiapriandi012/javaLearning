package com.bank;

public class BankBeraksi {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank ABC");

        //inisiasi saldo 100000 kedalam bank
        Bank aksi = new Bank(100000);

        //cek saldo
        aksi.getSaldo();

        //simpan uang 500000
        aksi.simpanUang(500000);
        aksi.getSaldo();

        //ambil uang 150000
        aksi.ambilUang(150000);
        aksi.getSaldo();
    }
}
