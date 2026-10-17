// Escreva um programa que obtém o salário de uma pessoa e diz se ela está ganhando pelo menos o salário mínimo.

import java.util.Scanner;

public class algr_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        float salario = scanner.nextFloat();

        String resultado = (salario > 1621) ? "\nVocê ganha pelo menos um salário mínimo" : "\nVocê nao ganha um salário mínimo";
        System.out.println(resultado);

        scanner.close();
    }
}
