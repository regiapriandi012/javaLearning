package com.tugasGui;
import javax.swing.*;
public class Gui {

    public static void main(String[] args) {
        String num1, num2;
        int number1, number2, sum;

        num1 = JOptionPane.showInputDialog("Bilangan Pertama");
        number1 = Integer.parseInt(num1);

        num2 = JOptionPane.showInputDialog("Bilangan Kedua");
        number2 = Integer.parseInt(num2);

        sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "Hasil Penjumlahannya Adalah : " + sum , "Hasil", JOptionPane.PLAIN_MESSAGE );

        System.exit(0);

    }
}