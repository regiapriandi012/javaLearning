package com.codecademy.loop;

import java.util.Scanner;
import java.util.Arrays;

class BilanganPrimaMain {
    //inisiasi main method untuk menjalankan program
    public static void main(String[] args) {

        // inisiasi variabel numbers berisi list angka dari 1 sampai 20
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // insisiasi objek class BilanganPrima dengan nama pd yang diikuti parameter dari variabel numbers
        BilanganPrima pd = new BilanganPrima(numbers);
        // menampilkan output string
        System.out.println("----- Contoh Bilangan Prima -----");
        System.out.println("Bilangan Prima Dari " + Arrays.toString(numbers) + " Adalah : ");
        // memanggil method hanyaPrima
        System.out.println(pd.hanyaPrima());
        System.out.println();

        // inisiasi objek input untuk membuat inputan dari user
        Scanner input = new Scanner(System.in);
        System.out.println("----- Cek Bilangan Prima ------");
        System.out.print("Masukan angka: ");

        // inisiasi variabel number untuk inputan dari user
        int number = input.nextInt();
        // jika output dari method iniPrima true, maka program akan menampilkan output string seperti dibawah ini
        if(pd.iniPrima(number)){
            System.out.println(number + " Merupakan Bilangan Prima");
            System.out.println();
            // jika output false, maka program akan menampilkan output string seperti dibawah ini
            } else {
            System.out.println(number + " Bukan Merupakan Bilangan Prima");
            System.out.println();
        }
    }
}

