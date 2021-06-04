package com.latihan;

import java.util.Scanner;

public class LoginSession{

    public static void main(String[] args) {

        int block = 0;
        Scanner input = new Scanner(System.in);

        for (int i=1; i<=3; i++){

            System.out.println("--> LOGIN SESSION <--");
            System.out.println("Username: ");
            String username = input.nextLine();
            System.out.println("Password: ");
            String password = input.nextLine();

            if (username.equals("admin") && password.equals("admin")) {
                System.out.println("Login successful!");
                break;
            }
            else {
                block += 1;
                System.out.println("Login failed (" + block + "/3)");
                System.out.println("");

                if (block >= 3) {
                    System.out.println("You have been blocked!");
                }
            }
        }
    }
}