package com.regiapriandi.praktikumpbo.pertemuan4.guided.contoh2;

public class Rabbit extends Animal{
    public Rabbit(String name) {
        super(name);
    }
    //overwrite
    public String getType(){
        return "Rabbit";
    }
    public String playSound(){
        return "Squeak~!";
    }
}
