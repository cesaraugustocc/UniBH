/* Você foi contratado como arquiteto real para desenhar a fachada de um novo mosaico de pedra. 
O rei exige que a borda do mosaico seja feita de blocos sólidos (#), mas o interior deve ser mantido totalmente limpo com espaços vazios (.). 
Para garantir a estrutura, os quatro cantos exatos do mosaico devem usar o caractere especial de reforço (+). 
Sua tarefa é escrever um programa que leia a dimensão da estrutura e construa o mosaico formatado. */

import java.util.Scanner;

public class MosaicoDoCastelo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro> 1){
            // Cabeçalho

            System.out.printf("--- DIMENSAO %d x %d ---\n", numeroInteiro, numeroInteiro);

            System.out.print("+");
            for (int i = 3; i <= numeroInteiro; i++) {
                System.out.print("#");
            }
            System.out.println("+");

            // Corpo

            if (numeroInteiro > 2) {
                for (int i = 3; i <= numeroInteiro; i++) {
                    System.out.print("#");
                    System.out.print(".".repeat(numeroInteiro - 2));
                    System.out.println("#");
                }
            }

            // Base

            System.out.print("+");
            for (int i = 3; i <= numeroInteiro; i++) {
                System.out.print("#");
            }
            System.out.println("+");
        }
        else if (numeroInteiro == 1){
            System.out.printf("--- DIMENSAO %d x %d ---\n", numeroInteiro, numeroInteiro);
            System.out.print("+");
        }
        else{
            System.out.print("Digite um numero > 0");
        }
        scanner.close();
    }
}