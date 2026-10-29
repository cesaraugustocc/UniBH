// Escreva um programa em Java que leia uma matriz de m x n de números inteiros a partir da entrada do usuário e, em seguida, imprima a matriz transposta.

import java.util.Scanner;

public class algr_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de M da matriz, referente a qntd linhas: ");
        int valorLinha = scanner.nextInt();

        System.out.print("Digite o valor de N, referente a qntd colunas: ");
        int valorColuna = scanner.nextInt();

        int [][] matrizNormal = new int [valorLinha][valorColuna];
        int [][] matrizTransposta = new int [valorColuna][valorLinha];

        for (int i = 0; i < matrizNormal.length; i++){
            System.out.println("\nLinha "+i+"\n");
            for (int j = 0; j < matrizNormal[i].length; j++){
                System.out.print("Digite o valor de "+"["+i+"]"+"["+j+"]: " );
                matrizNormal[i][j] = scanner.nextInt();

                matrizTransposta[j][i] = matrizNormal[i][j];
            }
        }

        System.out.println("\n\nMatriz original");
        for (int[] i : matrizNormal){
            System.out.println();
            for (int j : i){
                System.out.print(j+" ");
            }
        }

        System.out.println("\n\nMatriz Transposta");
        for (int[] i : matrizTransposta){
            System.out.println();
            for (int j : i){
                System.out.print(j+" ");
            }
        }

        scanner.close();
    }
}
