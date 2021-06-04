package com.regiapriandi.praktikumpbo.pertemuan3.unguided;

public class Harga {
    public int harga;
    public String asal;
    public String tujuan;
    public String waktu;

    public Harga(String asal, String tujuan, String waktu) {
        this.waktu = waktu;
        this.asal = asal;
        this.tujuan = tujuan;
    }

    public void fromJakarta(){
        switch (tujuan) {
            case "Bandung" -> harga += 200_000;
            case "Semarang" -> harga += 400_000;
            case "Surabaya" -> harga += 700_000;
        }
    }

    public void fromBandung(){
        switch (tujuan) {
            case "Jakarta" -> harga += 200_000;
            case "Semarang" -> harga += 500_000;
            case "Surabaya" -> harga += 800_000;
        }
    }

    public void fromSurabaya(){
        switch (tujuan) {
            case "Jakarta" -> harga += 700_000;
            case "Semarang" -> harga += 500_000;
            case "Bandung" -> harga += 800_000;
        }
    }

    public void fromSemarang(){
        switch (tujuan) {
            case "Jakarta" -> harga += 400_000;
            case "Surabaya" -> harga += 500_000;
            case "Bandung" -> harga += 500_000;
        }
    }

    public void info(){
        System.out.println();
        System.out.println("------> Pemesanan Kereta Cepat <------");
        System.out.println("Asal      : " + asal);
        System.out.println("Tujuan    : " + tujuan);
        System.out.println("Tarif Rp. : " + harga);
    }

    public void waktu(){
        switch (waktu){
            case "Pagi" -> System.out.println("Waktu     : 7:00 - 9:00");
            case "Siang" -> System.out.println("Waktu     : 12:00 - 14:00");
            case "Sore" -> System.out.println("Waktu     : 16:00 - 18:00");
            case "Malam" -> System.out.println("Waktu     : 20:00 - 22:00");
        }
    }
}