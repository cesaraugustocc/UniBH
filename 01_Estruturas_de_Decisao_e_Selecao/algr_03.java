// algr_03 com if-else

import java.util.Scanner;

public class algr_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        System.out.print("Digite o débito da conta: ");
        float debito = scanner.nextFloat();

        System.out.print("Digite o credito da conta: ");
        float credito = scanner.nextFloat();

        float saldoAtual = saldo - debito + credito;

        System.out.println("\nConta: " + numeroConta + "\nSaldo atual: " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("SALDO POSITIVO");
        } else {
            System.out.println("SALDO NEGATIVO");
        }

        scanner.close();
    }
}