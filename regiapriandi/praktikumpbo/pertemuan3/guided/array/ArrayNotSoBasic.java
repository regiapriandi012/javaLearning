package com.regiapriandi.praktikumpbo.pertemuan3.guided.array;

public class ArrayNotSoBasic {
    public static void main(String[] args) {
        int[] numbers = {7, 1 ,5, 6, 9, 4, 9};
        int panjangArray = numbers.length;

        System.out.print("Nilai array: [ ");
        for(int number: numbers)
            System.out.print(number + " ");
        System.out.println("]");

        System.out.println("Panjang Array: " + panjangArray);
    }
}
