/* Desenvolver um algoritmo estruturado que leia um número não determinado de valores e
calcule e escreva a média aritmética dos valores lidos, a quantidade de valores positivos, a
quantidade de valores negativos e o percentual de valores negativos e positivos. */

import java.util.Scanner;

public class algr_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 0 para finalizar o programa\n");

        double numero = 0;
        int contador = 0;
        int contadorNumPositivos = 0;
        int contadorNumNegativos = 0;
        double somaNumeros = 0;
        double mediaArtimetica = 0;
        double percValPos = 0;
        double percValNeg = 0;

        while (true) {

            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();
            if (numero == 0) {
                break;
            }
            contador++;
            somaNumeros += numero;

            if (numero > 0) {
                contadorNumPositivos++;
            }

            if (numero < 0) {
                contadorNumNegativos++;
            }
        }

        mediaArtimetica = somaNumeros / contador;

        if (contadorNumNegativos == 0) {
            percValPos = 100;
        } else if (contadorNumPositivos == 0) {
            percValNeg = 100;
        } else {
            percValPos = ((double)contadorNumPositivos/contador) *100;
            percValNeg = ((double)contadorNumNegativos / contador) * 100;
        }

        System.out.println("\nA Média Aritmética é: " + mediaArtimetica);
        System.out.println("O total de números Positivos: " + contadorNumPositivos);
        System.out.println("O total de números Negativos: " + contadorNumNegativos);
        System.out.println("A porcentagem de valores Negativos é: " + percValNeg + "%, e valores positivos é: "+ percValPos + "%\n");

        scanner.close();
    }
}