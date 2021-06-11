package com.regiapriandi.praktikumpbo.pertemuan6.guided.asosiasi;

public class Matkul {
    private String namaMatkul;
    private String kodeMatkul;

    public Matkul(String namaMatkul, String kodeMatkul) {
        this.namaMatkul = namaMatkul;
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }
}
