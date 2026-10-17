// As maçãs custam R$ 1,30 cada, se forem compradas menos de uma dúzia e R$ 1,00, se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. (Resolva com if-else e operador ternário)

import java.util.Scanner;

public class algr_01_opr_tern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maças compradas: ");
        int maca = scanner.nextInt();

        String resultado = (maca < 12) ? "\nValor total: R$ "+ maca*1.3 : "\nValor total: R$ "+maca; 
        System.out.println(resultado);

        scanner.close();
    }
}