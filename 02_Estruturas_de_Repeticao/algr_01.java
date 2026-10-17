/* Desenvolver um programa que leia o valor de dois números inteiros e a
operação aritmética desejada; calcule, então, a resposta adequada. Utilize os símbolos a seguir para
ler qual a operação aritmética escolhida.
1 - retornar o soma de dois números;
2 – retornar a subtração de dois números;
3 - retornar a multiplicação de dois números;
4 - retornar o quociente inteiro de uma divisão;
Deve-se permitir que o usuário tenha a opção de digitar novos valores ou encerrar a execução do
algortimo/programa. */

import java.util.Scanner;

public class algr_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int numero1 = 0;
        int numero2 = 0;

        while (continuar == true) {

            System.out.println("\nEscolha a operaçao aritmética desejada: \n");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtraçao");
            System.out.println("3 - Multiplicaçao");
            System.out.println("4 - Quociente");
            System.out.println("5 - Encerrar\n");
            System.out.print("Digite a opçao desejada: ");
            byte operacaoAritmetica = scanner.nextByte();

            if (operacaoAritmetica > 0 && operacaoAritmetica < 5) {
                System.out.println("\nDigite 2 números inteiros\n");
                System.out.print("Valor Primeiro Número: ");
                numero1 = scanner.nextInt();
                System.out.print("Valor Segundo Número: ");
                numero2 = scanner.nextInt();
            }

            switch (operacaoAritmetica) {

                case 1:
                    System.out.println("\nSOMA\n");
                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("\nSUBTRAÇAO\n");
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("\nMULTIPLICAÇAO\n");
                    System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("\nQuociente\n");
                    System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    System.out.println("RESTO = " + (numero1 % numero2));
                    break;
                case 5:
                    System.out.println("PROGRAMA ENCERRADO");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opçao Inválida, digite um valor válido");
            }
        }
        scanner.close();
    }
}