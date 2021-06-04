package com.regiapriandi.praktikumpbo.pertemuan2.guided.method;

public class TestPass {
    int nomer1, nomer2;

    public TestPass(int nomer1, int nomer2){
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }
    // pass by value
    public void calculate(int m, int n){
        m += 10;
        n /= 2;
    }
    // pass by reference
    public void calculate(TestPass tp){
        tp.nomer1 = tp.nomer1 * 10;
        tp.nomer2 = tp.nomer2 / 2;
    }
}