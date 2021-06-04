package com.codecademy.loop;
import java.util.ArrayList;

public class MostExpensive {
    public static void main(String[] args) {

        ArrayList<Double> expenses = new ArrayList<Double>();

        expenses.add(89.90);
        expenses.add(23.20);
        expenses.add(33.19);
        expenses.add(48.22);
        expenses.add(99.46);
        expenses.add(49.87);

        double mostExpensive = 0;
        //for-each loop
        for (double expense: expenses){
            if(expense > mostExpensive){
                mostExpensive = expense;
            }
        }
        System.out.println(mostExpensive);
    }
}
