/* Dados o número n de alunos de uma turma de Lógica e Técnicas de programação e suas notas da primeira DAD, 
escreva um algoritmo para determinar e imprimir a maior e a menor nota obtida por essa turma, 
onde a nota mínima é 0 e a nota máxima é 15. */

import java.util.Scanner;

public class algr_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor < 0 para interromper o programa\n");
        int maiorNota = 0;
        int menorNota = 0;
        int nota = 0;
        int i = 1;
        
        System.out.println("Digite uma nota entre 0 - 15\n");
        System.out.print("Digite a nota " + i + ": ");
        nota = scanner.nextInt();
        maiorNota = nota;
        menorNota = nota;
        i++;

        while (true) {

            System.out.print("Digite a nota " + i + ": ");
            nota = scanner.nextInt();
            i++;
            if (nota < 0) {
                break;
            } else {
                if (nota > maiorNota) {
                    maiorNota = nota;
                }

                if (nota < menorNota) {
                    menorNota = nota;
                }
            }
        }

        System.out.println("A maior nota é: "+maiorNota);
        System.out.println("A menor nota é: "+menorNota);
        scanner.close();
    }
}