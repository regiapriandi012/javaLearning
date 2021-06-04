package com.regiapriandi.praktikumpbo.pertemuan2.guided.classobject;

public class Object {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("Regi Apriandi", 19102283);

        //output mhs1
        System.out.println("==> data mhs1");
        System.out.println("Nama: " + mhs1.nama);
        System.out.println("Nim: " +  mhs1.nim);

        ///output mhs2
        System.out.println("==> data mhs2 <==");
        System.out.println("Nama: " + mhs2.nama);
        System.out.println("Nim: " + mhs2.nim);
    }
}
