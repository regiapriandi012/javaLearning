package com.codecademy.loop;

public class ContinueLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
