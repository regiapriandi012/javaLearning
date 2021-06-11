package com.regiapriandi.praktikumpbo.pertemuan6.guided.agregasi;

public class Jurusan {
    private String namaJurusan;
    private Dosen dosen;

    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
}
