package com.regiapriandi.praktikumpbo.pertemuan3.guided.array;
import java.util.Scanner;
public class ArrayVariableLength {
    public static void isiArray(int[] array){
        for(int i=0; i < array.length; i++)
            array[i] = i;
    }
    public static void lihatIsiArray(int[] array){
        System.out.print("Isi array numbers: ");
        System.out.print("[ ");
        for(int number : array)
            System.out.print(number + " ");
        System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan panjang array: ");
        int panjangArray = input.nextInt();

        int[] numbers = new int[panjangArray];

        isiArray(numbers);
        lihatIsiArray(numbers);
    }
}

