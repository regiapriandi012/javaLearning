package com.regiapriandi.praktikumpbo.pertemuan2.unguided.No2;

public class ClassConstructor {
    String nama, vision;

    public ClassConstructor(){
        nama = "no name";
        vision = "no vision";
    }

    public ClassConstructor(String nama){
        this.nama = nama;
        vision = "no vision";
    }

    public ClassConstructor(String nama, String vision){
        this.nama = nama;
        this.vision = vision;
    }
}
