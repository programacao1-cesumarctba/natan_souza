package com.ads.entities;

public class Factorial {

    public int calcFact(int a) {
        if (a == 0) {
            return 1;
        } else {
            return (a * calcFact(a - 1));
        }
    }

}
