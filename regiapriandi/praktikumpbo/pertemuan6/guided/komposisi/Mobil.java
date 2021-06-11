package com.regiapriandi.praktikumpbo.pertemuan6.guided.komposisi;

public class Mobil {
    private String nama;
    private Jok jok;
    private Mesin mesin;
    private Roda roda;

    public Mobil(String nama) {
        this.nama = nama;
    }

    public Mobil(String nama, Jok jok, Mesin mesin, Roda roda) {
        this.nama = nama;
        this.jok = jok;
        this.mesin = mesin;
        this.roda = roda;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJok(String bahan, String ukuran){
        jok = new Jok(bahan, ukuran);
    }

    public void setMesin(String radiator, String oli, int piston){
        mesin = new Mesin(radiator, oli, piston);
    }

    public void setRoda(String merek, String ring){
        roda = new Roda(merek, ring);
    }

    public void showSpec(){
        System.out.println("Spesifikasi mobil " + nama + ":");
        System.out.println("Jok: ");
        System.out.println("- Bahan  : " + jok.getBahan());
        System.out.println("- ukuran : " + jok.getUkuran());
        System.out.println();
        System.out.println("Mesin: ");
        System.out.println("- Radiator: " + mesin.getRadiator());
        System.out.println("- oli     : " + mesin.getOli());
        System.out.println("- piston  : " + mesin.getPiston());
        System.out.println();
        System.out.println("Roda: ");
        System.out.println("- Merk: " + roda.getMerk());
        System.out.println("- Ring: " + roda.getRing());
        System.out.println();
    }
}
