package com.ads;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 *  Escreva um programa em java que pergunte um numero inteiro para o usuario e escreva se o numero é par ou impar.
 *  Author: Natan Souza
 *
 */

public class Main {

    public static void main(String[] args) {
        // @Variables
        int x;

        // Define o local para padrão US.
        Locale.setDefault(Locale.US);

        // Inicializa um Scanner no System.in.
        Scanner inp = new Scanner(System.in);

        // Exibe no console uma mensagem.
        System.out.println("Please enter an integer value:");

        // Recebe via Scanner o valor.
        x = inp.nextInt();

        // Checa se o valor recebido é par ou impar e exibe no console.
        if (x % 2 == 0) {
            System.out.println("O valor: " + x + " é par");
        } else {
            System.out.println("O valor: " + x + " é impar");
        }

        // Remove o Scanner do System.in
        inp.close();
    }
}
