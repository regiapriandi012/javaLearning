package com.regiapriandi.praktikumpbo.pertemuan4.unguided;

public class UnsurKimia {
    private final String nama;
    private final String simbol;
    private final int nomorAtom;

    public UnsurKimia(String nama, String simbol, int nomorAtom) {
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
    }

    public String getGolongan() {
        return "Tidak Diketahui";
    }

    public String getNama() {
        return nama;
    }

    public String getSimbol() {
        return simbol;
    }

    public int getNomorAtom() {
        return nomorAtom;
    }

    public String getBentuk() {
        return "Tidak Diketahui";
    }

    public void info(){
        System.out.println("-----> Unsur Kimia <-----");
        System.out.println("Golongan    : " + getGolongan());
        System.out.println("Nama        : " + getNama());
        System.out.println("Simbol      : " + getSimbol());
        System.out.println("Nomer Atom  : " + getNomorAtom());
        System.out.println("Bentuk      : " + getBentuk());
        System.out.println();
    }
}

