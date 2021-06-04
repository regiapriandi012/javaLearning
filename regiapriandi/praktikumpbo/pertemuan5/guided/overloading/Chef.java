package com.regiapriandi.praktikumpbo.pertemuan5.guided.overloading;

public class Chef {
    String name;

    public Chef(String name) {
        this.name = name;
    }
    
    public void memasak(){
        System.out.println("Chef " + name + " Sedang memasak sesuatu!");
    }
    
    public void memasak(String namaMakanan){
        System.out.println("Chef " + name +" Sedang memasak " + namaMakanan);
    }
}
