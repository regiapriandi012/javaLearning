package com.regiapriandi.praktikumpbo.pertemuan6.guided.komposisi;

public class Main {
    public static void main(String[] args) {

    Mobil mobil = new Mobil("lancer");

    mobil.setJok("kulit kuda", "L");
    mobil.setMesin("Water Coling", "aftur", 12);
    mobil.setRoda("Marchessini", "15");

    mobil.showSpec();
    }
}
