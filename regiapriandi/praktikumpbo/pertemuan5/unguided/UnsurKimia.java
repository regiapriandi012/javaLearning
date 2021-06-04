package com.regiapriandi.praktikumpbo.pertemuan5.unguided;

public class UnsurKimia {
    private final String unsur;
    
    public UnsurKimia(String unsur){
        this.unsur = unsur;
    }
    public String getUnsur() {
        return unsur;
    }

    public void info(){
        if (getUnsur().equals("Hidrogen")){
            System.out.println(getUnsur() + " Merupakan unsur dengan bentuk gas");
        }
        else{
            System.out.println(getUnsur() + "Merupakan unsur dengan bentuk padat");
        }
    }

    public void info(int nomerAtom){
        if (nomerAtom==1){
            System.out.println(getUnsur() + " Merupakan unsur periode 1");
        }
        else if (nomerAtom==3){
            System.out.println(getUnsur() + " Merupakan unsur periode 2");
        }
        else if (nomerAtom==11){
            System.out.println(getUnsur() + " Merupakan unsur periode 3");
        }
        else if (nomerAtom==19){
            System.out.println(getUnsur() + " Merupakan unsur periode 4");
        }
        else if (nomerAtom==37){
            System.out.println(getUnsur() + " Merupakan unsur periode 5");
        }
        else if (nomerAtom==55){
            System.out.println(getUnsur() + " Merupakan unsur periode 6");
        }
        else if (nomerAtom==87){
            System.out.println(getUnsur() + " Merupakan unsur periode 7");
        }
    }
}
