package com.pbo.segitiga;

public class Segitiga {
    private int lebar;
    
    public Segitiga(int lebar){
        this.lebar = lebar;
    }
    
    public String gambarSegitiga(){
    String r = "";
    //nested loop
    for (int i=1; i <= lebar; i++){
        for (int j=1; j <= i; j++)
            r = r + "[]";
            r = r + "\n";
        
    }
    return r;
    }
}
