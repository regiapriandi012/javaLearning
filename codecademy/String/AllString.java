package com.codecademy.String;

public class AllString {
    public static void main(String[] args) {
        String belajar1 = "Cybersecurity is the practice of protecting systems, ";
        String belajar2  = "networks, and programs from digital attacks.";

        // length()
        System.out.println("- length");
        System.out.println(belajar1.length());
        System.out.println(belajar2.length());
        System.out.println();

        // concat
        System.out.println("- concat");
        System.out.println(belajar1.concat(belajar2));
        System.out.println();

        // equals
        System.out.println("- equals");
        System.out.println(belajar1.equals("Cybersecurity is the practice of protecting systems, "));
        System.out.println();

        // indexOf
        System.out.println("- indexOf");
        System.out.println(belajar1.indexOf("practice"));
        System.out.println();

        // charAt
        System.out.println("- charAt");
        System.out.println(belajar1.charAt(10));
        System.out.println();

        // substring
        System.out.println("- substring");
        System.out.println(belajar1.substring(21));
        System.out.println(belajar1.substring(21, 29));
        System.out.println();

        // toUpperCase and toLowerCase
        System.out.println("- toLowerCase");
        System.out.println(belajar1.toLowerCase());
        System.out.println();

        System.out.println("- toUpperCase");
        System.out.println(belajar1.toUpperCase());
        System.out.println();
    }
}
