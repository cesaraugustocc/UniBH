/*Faça um programa que receba a idade de um nadador e mostre a sua categoria

IDADE 
CATEGORIA

até 7 anos
INFANTIL

8 a 10 anos
JUVENIL

11 a 15 anos
ADOLESCENTE

16 a 30 anos
ADULTO

acima de 30 anos
SENIOR */

import java.util.Scanner;

public class algr_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade <= 7) {
            System.out.println("INFANTIL");
        } else if (idade <= 10) {
            System.out.println("JUVENIL");
        } else if (idade <= 15) {
            System.out.println("ADOLESCENTE");
        } else if (idade <= 30) {
            System.out.println("ADULTO");
        } else {
            System.out.println("SÊNIOR");
        }

        scanner.close();
    }
}
