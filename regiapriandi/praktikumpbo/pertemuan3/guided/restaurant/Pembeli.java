package com.regiapriandi.praktikumpbo.pertemuan3.guided.restaurant;

public class Pembeli {
    private final String nama;
    private Item[] historyBelanja = new Item[99];
    private int itemsOrdered = 0;

    public Pembeli(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    public void pembelianMakanan(Item item){
        historyBelanja[itemsOrdered] = item;
        itemsOrdered++;
        System.out.println(item.getNama() + " Telah ditambahkan ke history belanja sdr " + getNama());
    }

    public void lihatHistory(){
        if(itemsOrdered > 0){
            System.out.println("History Pemesaan sdr " + this.getNama() + ": ");
            for (int i = 0; i < itemsOrdered; i++){
                Item pesanan = historyBelanja[i];
                System.out.println("- " + pesanan.getNama() + " ( " + pesanan.getJenis() + ") - Rp " + pesanan.getHarga());
            }
            System.out.println();
        } else {
            System.out.println("Anda belum pernah memesean apa-apa!");
            System.out.println();
        }
    }

    public void kosongkanHistory(){
        historyBelanja = new Item[999];
        itemsOrdered = 0;
        System.out.println("History belanja anda berhasil dikosongkan!");
    }
}
