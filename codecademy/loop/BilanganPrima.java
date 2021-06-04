package com.codecademy.loop;

import java.util.ArrayList;

class BilanganPrima {
    // inisiasi atribut dengan nama numbers dengan tipe data array integer
    public int[] numbers;

    //inisiasi constructor dengan parameter numbers
    public BilanganPrima(int[] numbers) {
        this.numbers = numbers;
    }
    // inisiasi method dengan nama iniPrima dengan parameter number bertipe data integer
    public boolean iniPrima(int number){
        // jika number = 2 maka program akan mereturn true
        if (number == 2) {
            return true;
        }
        // jika number kurang dari 2 maka program akan mereturn false
        else if (number < 2) {
            return false;
        }
        // perulangan untuk mengecek apakah bilangan divisible by 0, jika iya maka program akan mereturn false
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        // jika perulangan tidak mereturn false maka program akan mereturn true
        return true;
    }
    // inisiasi method dengan nama hanyaPrima dan dengan tipe data Arraylist integer tanpa parameter
    public ArrayList<Integer> hanyaPrima(){
    // inisiasi objek arraylist integer primes yang berfungsi untuk menyimpan setiap element dari numbers
    ArrayList<Integer> primes = new ArrayList<>();
    // perulangan untuk mengambil setiap element di variabel numbers
        for(int number : numbers) {
            /* jika output dari method iniPrima true, maka program otomatis akan menambahkan element number
            ke objek print */
            if (iniPrima(number)) {
                primes.add(number);
        }
    }
    // setelah for berakhir maka program mereturn variable primes
    return primes;
    }
}

