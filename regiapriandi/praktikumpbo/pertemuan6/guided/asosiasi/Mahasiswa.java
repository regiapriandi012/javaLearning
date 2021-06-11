package com.regiapriandi.praktikumpbo.pertemuan6.guided.asosiasi;

public class Mahasiswa {
    private String nim;
    private final String[] kodeMatkul = new String[10];
    private final String[] namaMatkul = new String[10];
    private int jmlMatkul = 0;

    //constructor
    public Mahasiswa(String nim){
        this.nim = nim;
    }
    //Getter NIM
    public String getNim() {
        return nim;
    }
    //Setter NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setMatkul(Matkul matkul){
        if(jmlMatkul!= this.kodeMatkul.length){
            this.namaMatkul[jmlMatkul] = matkul.getNamaMatkul();
            this.kodeMatkul[jmlMatkul] = matkul.getKodeMatkul();
            jmlMatkul++;
        } else {
            System.out.println("Maaf, Daftar matkul penuh!");
        }
    }

    public void setMatkul(Matkul matkul, int index){
        this.namaMatkul[index] = matkul.getNamaMatkul();
        this.kodeMatkul[index] = matkul.getKodeMatkul();
    }

    public void showMatkul(){
        System.out.println("daftar matkul mahasiswa berNIM " + nim + ":");

        for(int i=0; i<jmlMatkul; i++){
            System.out.println("- " + namaMatkul[i] + " (" + kodeMatkul[i] + ")");
        }
        System.out.println();
    }
}
