package com.regiapriandi.praktikumpbo.pertemuan3.guided.restaurant;
import java.util.Scanner;

public class Main {
    static Item[] menu = {
            new Item("Mendoan", 1_000, "Makanan"),
            new Item("Es Teh", 2_500, "Minuman"),
            new Item("Aneka Sayur", 5_000, "Makanan"),
            new Item("Ayam Goreng", 7_500, "Makanan"),
            new Item("Milk Tea", 10_000, "Minuman"),
            new Item("Sate Ayam", 15_000, "Makanan")
    };

    static void tampilkanMenu(){
        System.out.println("==> Menu Hidangan <== ");

        int noItem = 1;
        for(Item item: menu){
            System.out.println(noItem + ") " + item.getNama() + " - Rp " + item.getHarga());
            noItem++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama Anda: ");
        String namaPembeli = input.nextLine();

        Pembeli pembeli = new Pembeli(namaPembeli);

        System.out.println("Selamat Datang ," + pembeli.getNama());

        boolean isLooping = true;
        do{
            System.out.println("==> Menu Utama <==");
            System.out.println("1) Pesan makanan");
            System.out.println("2) Lihat history pemesanan");
            System.out.println("3) Kosongkan history pemesanan");
            System.out.println("4) Keluar");
            System.out.println("> ");

            int nav = input.nextInt();
            System.out.println();

            switch (nav) {
                case 1 -> {
                    tampilkanMenu();
                    System.out.println("> ");
                    int pilih = input.nextInt() - 1;
                    boolean inputInvalid = false;
                    if (inputInvalid) {
                        System.out.println("Error: mohon masukan pilihan yang benar!");
                    }else {
                        Item barang = menu[pilih];
                        pembeli.pembelianMakanan(barang);
                    }
                    System.out.println();
                }
                case 2 -> pembeli.lihatHistory();
                case 3 -> pembeli.kosongkanHistory();
                case 4 -> {
                    System.out.println("Terimakasih sudah berbelanja! ^^");
                    isLooping = false;
                }
                default -> {
                    System.out.println("Error: Mohon hanya masukan angka 1-4 saja!");
                    System.out.println();
                }
            }
        } while (isLooping);
    }
}
