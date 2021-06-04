package com.regiapriandi.praktikumpbo.pertemuan4.unguided;

public class LogamAlkali extends UnsurKimia{

    public LogamAlkali(String nama, String simbol, int nomerAtom){
        super(nama, simbol, nomerAtom);

    }
    public String getGolongan(){
        return "1";
    }

    public String getBentuk(){
        if(getNama().equals("Hidrogen"))
            return "Gas";
        else
            return "Padat";
    }
}