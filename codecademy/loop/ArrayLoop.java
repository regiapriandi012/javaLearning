package com.codecademy.loop;

import java.util.Arrays;
public class ArrayLoop {

    public static void main(String[] args) {

        int[] kumpulan = {2, 43, 4, 1, 4};

        for (int i = 0; i < kumpulan.length; i++) {
            kumpulan[i] *= 10;
            System.out.println(kumpulan[i]);
        }
    }
}
