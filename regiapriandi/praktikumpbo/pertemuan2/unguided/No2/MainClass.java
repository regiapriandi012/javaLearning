package com.regiapriandi.praktikumpbo.pertemuan2.unguided.No2;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Daftar Nama Chara Cringe");

        //with not have name and not have vision
        ClassConstructor chara1 = new ClassConstructor();

        //with have name and not have vision
        ClassConstructor chara2 = new ClassConstructor("Paimon");

        //with have name and have vision
        ClassConstructor chara3 = new ClassConstructor("Tatang", "Hydro");

        //create or initialization a array with name chara for save the object
        //create a array with size = 3
        ClassConstructor[] chara = new ClassConstructor[3];
        //add some object to array chara
        chara[0] = chara1;
        chara[1] = chara2;
        chara[2] = chara3;
        //create for loop
        for(ClassConstructor i : chara){
            System.out.println("Nama chara  : " + i.nama);
            System.out.println("Vision      : " + i.vision);
            System.out.println("");
        }


    }
}
