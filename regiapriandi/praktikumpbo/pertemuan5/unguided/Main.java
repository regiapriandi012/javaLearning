package com.regiapriandi.praktikumpbo.pertemuan5.unguided;

public class Main {
    public static void main(String[] args) {
        UnsurKimia hidrogen = new UnsurKimia("Hidrogen");
        GasMulia helium = new GasMulia("Helium");
        LogamAlkali kalium = new LogamAlkali("Kalium");

        //overloading
        hidrogen.info();
        hidrogen.info(1);
        System.out.println();

        //overridding
        helium.info();
        kalium.info();
    }
}
