// Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior, segundo a legislação brasileira. Escreva uma versão com if/else e outra com o operador ternário.

import java.util.Scanner;

public class algr_06_opr_tern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        String resultado = (idade >= 18) ? "\nMaior de Idade" : "\nMenor de Idade";
        System.out.println(resultado);

        scanner.close();
    }
}