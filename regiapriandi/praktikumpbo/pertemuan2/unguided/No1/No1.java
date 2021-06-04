package com.regiapriandi.praktikumpbo.pertemuan2.unguided.No1;

public class No1 {

    public static void hitungUmur(int tahunLahir){
        int umur = 2021 - tahunLahir;
        System.out.println("Masukan Tahun Lahir: " + tahunLahir);
        System.out.println("Umur Kamu adalah: " + umur + " Tahun");
    }

    public static void main(String[] args) {
        hitungUmur(1992);
    }
}
