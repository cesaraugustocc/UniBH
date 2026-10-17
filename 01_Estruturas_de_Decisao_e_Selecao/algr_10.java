// Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário não tenha direito ao aumento.

import java.util.Scanner;

public class algr_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        float salario = scanner.nextFloat();
        double aumento = 0;

        if (salario < 1000) {
            aumento = 0.3;
            System.out.println("\nVocê tem direito ao aumento de 30%!\n");
        } else {
            System.out.println("\nVocê nao tem direito ao aumento!\n");
        }

        System.out.println("Salário Atual: " + ((salario * aumento) + salario));

        scanner.close();
    }
}