package com.regiapriandi.praktikumpbo.pertemuan4.guided.contoh2;

public class Main {
    public static void main(String[] args) {
        //Object contructor
        Animal animal = new Animal("An animal");
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Blacky");
        Rabbit rabbit = new Rabbit("Bunny");

        //Output
        animal.showProfile();
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
    }
}
