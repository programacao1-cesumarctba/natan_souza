package com.ads.entities;

public class Bhaskara {

    protected double a, b, c, d, x1, x2  = 0.0;

    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.calcDelta();
    }

    private void calcDelta() {
        this.d = (Math.pow(this.b, 2) - (4 * this.a * this.c));
        this.calcX();
    }

    private void calcX() {
        this.x1 = (float) ((-this.b + Math.sqrt(this.d)) / (2 * this.a));
        System.out.printf("The value of x¹ is %.2f", this.x1);
        this.x2 = (float) ((-this.b - Math.sqrt(this.d)) / (2 * this.a));
        System.out.printf("\n The value of x² is %.2f ", this.x2);
    }

    public String classificacao() {
        if (this.d < 0) {
            return "A equação do segundo grau não possui raízes reais.";
        } else if (this.d == 0) {
            return "A equação do segundo grau possui uma raiz real.";
        } else {
            return "A equação do segundo grau possui duas raízes reais.";
        }
    }

}
