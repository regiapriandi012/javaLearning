package com.regiapriandi.praktikumpbo.pertemuan3.unguided;
import java.util.Scanner;

public class Pemesanan {
    public static void show(){
        System.out.println();
        System.out.println("--------> Selamat Datang Di Portal Pemesanan Kereta Cepat Lintas Jawa <--------");
        System.out.println("--------> Route ini melintasi Jakarta - Bandung - Semarang - Surabaya <--------");
        System.out.println("Terdapat 4 pemilihan Asal Stasiun   : Jakarta, Bandung, Semarang, Surabaya");
        System.out.println("Terdapat 4 pemilihan Tujuan Stasiun : Jakarta, Bandung, Semarang, Surabaya");
        System.out.println("Terdapat 4 pemilihan waktu          : Pagi, Siang, Sore, Malam");
        System.out.println();
    }

    public static void main(String[] args) {
        show();
        //inisiasi objek input
        Scanner input = new Scanner(System.in);

        System.out.print("Asal Stasiun Perjalanan Anda   : ");
        String asal = input.nextLine();

        System.out.print("Tujuan Stasiun Perjalanan Anda : ");
        String tujuan = input.nextLine();

        System.out.print("Waktu Perjalanan Anda          : ");
        String waktu = input.nextLine();

        Harga tarif = new Harga(asal, tujuan, waktu);

        switch (asal) {
            case "Jakarta" -> {
                tarif.fromJakarta();
                tarif.info();
                tarif.waktu();
            }
            case "Semarang" -> {
                tarif.fromSemarang();
                tarif.info();
                tarif.waktu();
            }
            case "Surabaya" -> {
                tarif.fromSurabaya();
                tarif.info();
                tarif.waktu();
            }
            case "Bandung" -> {
                tarif.fromBandung();
                tarif.info();
                tarif.waktu();
            }
        }
    }
}