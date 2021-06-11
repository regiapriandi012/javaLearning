package com.regiapriandi.praktikumpbo.pertemuan6.guided.agregasi;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("209847", "axel");
        Jurusan jurusan = new Jurusan("astronomi dan teknik informatika");

        //set Dosen
        jurusan.setDosen(dosen);

        //output
        System.out.println("NIDN Dosen: " + jurusan.getDosen().getNidn());
        System.out.println("Nama Dosen: " + jurusan.getDosen().getNama());
        System.out.println("Jurusan   : " + jurusan.getNamaJurusan());
    }
}
