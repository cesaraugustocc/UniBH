/*  8. Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
 1 – Somar
 2 – Subtrair 
 3 – Multiplicar
 4 – Dividir
 5 – Sair 
 
Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção. */

import java.util.Scanner;

public class algr_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o 2° número: ");
        float num2 = scanner.nextFloat();

        System.out.println("\nMENU");
        System.out.println("\n1 - SOMAR\n2 - SUBTRAIR\n3 - MULTIPLICAR\n4 - DIVIDIR\n5 - SAIR");
        System.out.print("\nDigite a opçao desejada: ");
        byte escolha = scanner.nextByte();

        float soma = num1 + num2;
        float subtracao = num1 - num2;
        float multiplicacao = num1 * num2;
        float divisao = num1 / num2;

        switch (escolha) {
            case 1:
                System.out.println("\nSOMA\n");
                System.out.println(num1 + " + " + num2 + " = " + soma);
                break;
            case 2:
                System.out.println("\nSUBTRACAO\n");
                System.out.println(num1 + " - " + num2 + " = " + subtracao);
                break;
            case 3:
                System.out.println("\nMULTIPLICAÇAO\n");
                System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
                break;
            case 4:
                System.out.println("\nDIVISAO\n");
                System.out.println(num1 + " / " + num2 + " = " + divisao);
                break;
            case 5:
                System.out.println("\nPROGRAMA ENCERRADO");
                break;
            default:
                break;
        }

        scanner.close();
    }
}