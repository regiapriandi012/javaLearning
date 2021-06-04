package com.pbo.segitiga;

/**
 *
 * @author regia
 */
public class SegitigaBeraksi {

    public static void main(String[] args) {
        // TODO code application logic here
        Segitiga kecil = new Segitiga(5);
        System.out.println(kecil.gambarSegitiga());
        
        Segitiga besar = new Segitiga(20);
        System.out.println(besar.gambarSegitiga());
    }
    
}
