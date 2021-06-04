package com.regiapriandi.praktikumpbo.pertemuan4.guided.contoh2;

public class Main2 {
    public static void main(String[] args) {
        Animal[] habitat = {
                new Cat("Cat1"),
                new Dog("Dog2"),
                new Rabbit("Rabbit3"),
        };

        //output cara 1
        int animalCount = habitat.length;
        for(int i=0; i < animalCount; i++){
            habitat[0].showProfile();
        }
        //output cara 2
        for(Animal animal : habitat){
            animal.showProfile();
        }
    }
}
