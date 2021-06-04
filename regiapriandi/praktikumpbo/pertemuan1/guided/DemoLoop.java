package com.regiapriandi.praktikumpbo.pertemuan1.guided;

public class DemoLoop {
    public static void main(String[] args) {
        // for loop
        for(int i=1; i<=5; i++){
            System.out.println("For loop (" + i + "/5)");
        }
        System.out.println("");
        
        // while loop
        int j=1;
        while(j<=5){
            System.out.println("While loop (" + j + "/5)");
            j++;
        }
        System.out.println("");
        
        // do while loop
        int k=1;
        do {
            System.out.println("Do-while loop (" + k + "/5)");
            k++;
        } while(k<=5);
        System.out.println("");
        
        // untuk memberhentikan loop
        int x=1;
        while(x<=9999999){
            System.out.println("Looping... (" + x + "/999999)");
            x++;
            
            if(x == 5){
                System.out.println("Udah ah, cape!");
                break;
            }
        }
    }
}
