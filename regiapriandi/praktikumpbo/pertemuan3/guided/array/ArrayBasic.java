package com.regiapriandi.praktikumpbo.pertemuan3.guided.array;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int panjangArray = numbers.length;

        for(int i = 0; i <panjangArray;i++)
            numbers[i] = i;

        System.out.print("Nilai array: [ ");
        for(int i = 0; i < panjangArray; i++)
            System.out.print(numbers[i] + " ");
        System.out.println("]");

        System.out.print("Nilai array: [ ");
        for(int number: numbers)
            System.out.print(number + " ");
        System.out.println("]");
    }
}
