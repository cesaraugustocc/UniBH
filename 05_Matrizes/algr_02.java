// Simula a ocupação de uma sala de cinema usando uma matriz 10×12 e verifica se há assentos livres consecutivos suficientes para acomodar um grupo na mesma fileira.

import java.util.Scanner;

public class algr_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        Boolean check = true;

        int[][] matrizSalaCinema = {
                { 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0 },
                { 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1 },
                { 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1 },
                { 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0 },
                { 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1 },
                { 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1 },
                { 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1 },
                { 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0 }
        };

        System.out.print("Digite a quantidade de pessoas no grupo: ");
        int qtdPessoasGrupo = scanner.nextInt();

        for (int i = 0; i < matrizSalaCinema.length; i++) {

            for (int j = 0; j < matrizSalaCinema[i].length; j++) {
                if (matrizSalaCinema[i][j] == 0) {
                    contador++;
                } else {
                    contador = 0;
                }

                if (contador == qtdPessoasGrupo) {
                    System.out.println("\nGrupo pode sentar na fileira " + (i + 1) + ", da coluna "
                            + ((j + 2) - qtdPessoasGrupo) + " até a " + (j + 1));
                    check = false;
                    break;
                }
            }

            if (check == false) {
                break;
            }
        }

        if (check == true) {
            System.out.println("\nNao é possível alocar os assentos juntos");
        }

        scanner.close();
    }
}