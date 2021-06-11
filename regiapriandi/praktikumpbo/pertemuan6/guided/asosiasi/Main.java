package com.regiapriandi.praktikumpbo.pertemuan6.guided.asosiasi;

public class Main {
    public static void main(String[] args){
        Matkul m1 = new Matkul("Pemograman Berorientasi Objek", "m1");
        Matkul m2 = new Matkul("Kecerdasan buatan", "m2");

        Mahasiswa mhs = new Mahasiswa("19102283");

        mhs.setMatkul(m1);
        mhs.setMatkul(m2);

        mhs.showMatkul();
    }
}