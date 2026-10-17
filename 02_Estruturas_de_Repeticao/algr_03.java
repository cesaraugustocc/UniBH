/* Uma grande firma deseja saber qual é o empregado mais recente e qual é o mais antigo.
Desenvolver um algoritmo e um programa em  para ler um número indeterminado de informações
(máximo de 300) contendo o número do empregado e o número de meses de trabalho deste
empregado e imprimir o mais recente e o mais antigo. Obs.: A última informação contém os dois
números iguais a zero. Não existem dois empregados admitidos no mesmo mês. */

import java.util.Scanner;

public class algr_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 0 nas duas variáveis para encerrar");

        int mesFunNovo;
        int mesFunAntigo;
        int mes;
        int i = 1;
        int numeroNomeNovo = i;
        int numeroNomeAntigo = i;
        int ID = 0;
        int IDfunNovo = ID;
        int IDfunAntigo = ID;

        // Iniciar variavel
        System.out.print("\nDigite a quantos meses o funcionario " + i + " ingressou: ");
        mes = scanner.nextInt();
        mesFunNovo = mes;
        mesFunAntigo = mes;

        System.out.print("Digite o ID do funcionário " + i + ": ");
        ID = scanner.nextInt();
        IDfunAntigo = ID;
        IDfunNovo = ID;

        for (i = 2; i < 301; i++) {

            if (mes == 0 && ID == 0) {
                break;
            }

            System.out.print("\nDigite a quantos meses o funcionario " + i + " ingressou: ");
            mes = scanner.nextInt();

            System.out.print("Digite o ID do funcionário " + i + ": ");
            ID = scanner.nextInt();

            if (mes == 0 && ID == 0) {
                break;
            } else {

                if (mes < mesFunNovo) {
                    mesFunNovo = mes;
                    numeroNomeNovo = i;
                    IDfunNovo = ID;
                }

                if (mes > mesFunAntigo) {
                    mesFunAntigo = mes;
                    numeroNomeAntigo = i;
                    IDfunAntigo = ID;
                }
            }
        }

        if (mes == mesFunNovo && mes == mesFunAntigo) {
            System.out.println("\nPROGRAMA ENCERRADO\n");
        } else {
            System.out.println("\nO Funcionário " + numeroNomeNovo + ", com ID " + IDfunNovo
                    + " é o mais Novo na empresa, com um total de " + mesFunNovo + " Meses na empresa.");
            System.out.println("O Funcionário " + numeroNomeAntigo + ", com ID " + IDfunAntigo
                    + " é o mais Velho na empresa, com um total de " + mesFunAntigo + " Meses na empresa.\n");
        }
        scanner.close();
    }
}