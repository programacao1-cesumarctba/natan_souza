package com.ads;

import com.ads.entities.Factorial;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 *  1 - Escreva um programa em java que pergunte um numero inteiro para o usuario e escreva se o numero é par ou impar.
 *  2 - Dado um valor inteiro N, verifique as seguintes condições: . Se N for impar, exiba "Estranho" . Se N for par e for menor que 10, exiba "Não é estranho" . Se N for par e estiver entre 10 e 20, exiba "Estranho" . Se N for par e for maior que 20, exiba "Não é estranho"
 *  3 - Sabendo que o fatorial de um valor N é: -----> n! = n x (x - 1) x (n - 2) x (n - 3) x ... x 2 x 1. Crie um código que leia um valor inteiro e retorne seu fatorial e seu resultado.
 *  4 - Crie um programa que receba um valor numerico inteiro N, e calcule a tabuada completa desse numero de 1 até 10. Imprimindo linha a linha da tabuada. 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6...
 *
 *  Author: Natan Souza
 */

public class Main {

    public static void main(String[] args) {
        // @Variables
        int x;

        // Define o local para padrão US.
        Locale.setDefault(Locale.US);

        // Inicializa um Scanner no System.in.
        Scanner inp = new Scanner(System.in);

        /**
         *  Ex 1
         */

        // Exibe no console uma mensagem.
        System.out.println("Please enter an integer value:");

        // Recebe via Scanner o valor.
        x = inp.nextInt();

        // Checa se o valor recebido é par ou impar e exibe no console.
        if (x % 2 == 0) {
            System.out.println("The value of: " + x + " is even");
        } else {
            System.out.println("The value of: " + x + " is odd");
        }

        // Remove o valor do Scanner.
        inp.nextLine();

        /**
         *  Ex 2
         */

        // Exibe no console uma mensagem.
        System.out.println("Please enter an integer value to see the conditions:");

        // Recebe via scanner o valor.
        x = inp.nextInt();

        // Valida as condições
        if (!(x % 2 == 0)) {
            System.out.println("Estranho");
        } else if(x < 10) {
            System.out.println("Não é estranho");
        } else if(x >= 10 && x <= 20) {
            System.out.println("Estranho");
        } else {
            System.out.println("Não é estranho");
        }

        // Remove o valor do Scanner.
        inp.nextLine();

        /**
         *  Ex 3
         */

        // Exibe no console uma mensagem.
        System.out.println("Please enter an integer value to calculate the factorial value:");

        // Recebe via Scanner o valor.
        x = inp.nextInt();

        // Calculate factorial of @Variables int x
        System.out.println("The factorial of: " + x + " is " + new Factorial().calcFact(x));

        // Remove o valor do Scanner.
        inp.nextLine();

        /**
         *  Ex 4
         */

        // Exibe no console uma mensagem.
        System.out.println("Please enter an integer value to calculate the times table from 0 to 10:");

        // Recebe via Scanner o valor.
        x = inp.nextInt();

        // Calcula e imprime o valor linha a linha.
        for (int i = 0; i <= 10; i++) {
            System.out.println(x + "x" + i + " é " + x*i);
        }

        // Remove o Scanner do System.in
        inp.close();
    }
}
