package com.regiapriandi.praktikumpbo.pertemuan2.guided.pvt;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new Manusia[3];

        Manusia m1 = new Manusia();
        m1.setNama("Regi");
        m1.setUmur(20);

        Manusia m2 = new Manusia("Finn");
        Manusia m3 = new Manusia("Darwin", 16);

        arrayManusia[0] = m1;
        arrayManusia[1] = m2;
        arrayManusia[2] = m3;

        for(Manusia m : arrayManusia){
            System.out.println("Character");
            System.out.println("nama: " + m.getNama());
            System.out.println("umur: " + m.getUmur());
            System.out.println();
        }

    }
}
