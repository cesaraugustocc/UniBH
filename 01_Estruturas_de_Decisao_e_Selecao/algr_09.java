// Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês com este número.

import java.util.Scanner;

public class algr_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1-12: ");
        int numero = scanner.nextInt();

        if (numero > 0 && numero <= 12) {
            if (numero == 1) {
                System.out.println("\nJANEIRO");
            } else if (numero == 2) {
                System.out.println("\nFEVEREIRO");
            } else if (numero == 3) {
                System.out.println("\nMARÇO");
            } else if (numero == 4) {
                System.out.println("\nABRIL");
            } else if (numero == 5) {
                System.out.println("\nMAIO");
            } else if (numero == 6) {
                System.out.println("\nJUNHO");
            } else if (numero == 7) {
                System.out.println("\nJULHO");
            } else if (numero == 8) {
                System.out.println("\nAGOSTO");
            } else if (numero == 9) {
                System.out.println("\nSETEMBRO");
            } else if (numero == 10) {
                System.out.println("\nOUTUBRO");
            } else if (numero == 11) {
                System.out.println("\nNOVEMBRO");
            } else {
                System.out.println("\nDEZEMBRO");
            }
        } else {
            System.out.println("\nNao existe mês correspondente a esse número!");
        }

        scanner.close();
    }
}