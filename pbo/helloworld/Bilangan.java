/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.helloworld;

/**
 *
 * @author regia
 */
public class Bilangan {
    static int pencacah = 0;
    int nilai;
    
    public Bilangan(int nilai) {
        this.nilai = nilai;
        pencacah++;
    }
    
    public void info() {
        System.out.println("Nilai: " + nilai);
        System.out.println("Pencacah: " + pencacah);
        System.out.println("");
    }
}

