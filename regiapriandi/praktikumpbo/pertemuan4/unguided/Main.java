package com.regiapriandi.praktikumpbo.pertemuan4.unguided;

public class Main {
    public static void main(String[] args) {
        UnsurKimia tidakDiketahui = new UnsurKimia("Tidak Diketahui", "Tidak Diketahui", 0);
        // inisiasi unsur kimia logam alkali
        LogamAlkali hidrogen = new LogamAlkali("Hidrogen", "H", 1);
        LogamAlkali kalium = new LogamAlkali("Kalium", "K", 19);
        LogamAlkali natrium = new LogamAlkali("Natrium", "Na", 11);

        //inisiasi unsur kimia gas mulia
        GasMulia helium = new GasMulia("Helium", "He", 2);
        GasMulia neon = new GasMulia("Neon", "Ne", 10);

        //tampilkan info unsur kimia
        //tidak diketahui
        tidakDiketahui.info();

        //logam alkali
        hidrogen.info();
        kalium.info();
        natrium.info();
        //gas mulia
        helium.info();
        neon.info();
    }
}

