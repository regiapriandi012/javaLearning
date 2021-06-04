package com.codecademy.loop;

import java.util.ArrayList;

class RemoveValue {

    public static ArrayList<String> removeAntsFor(ArrayList<String> lunchBoxFor) {
        // Add your code below
        for(int i = 0; i < lunchBoxFor.size(); i++){
            if(lunchBoxFor.get(i).equals("ant")){
                lunchBoxFor.remove(lunchBoxFor.get(i));
                i--;
            }
        }
        return lunchBoxFor;
    }

    public static ArrayList<String> removeAntsWhile(ArrayList<String> lunchBoxWhile){
        int i = 0;
        while(i < lunchBoxWhile.size()){
            if(lunchBoxWhile.get(i).equals("ant")){
                lunchBoxWhile.remove(i);
            }
        }
        return lunchBoxWhile;
    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");

        System.out.println(removeAntsFor(lunchContainer));
        System.out.println(removeAntsWhile(lunchContainer));
    }
}
