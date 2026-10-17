// Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se o saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. (Resolva com if-else e operador ternário)

import java.util.Scanner;

public class algr_03_opr_tern {
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

        String resultado = (saldoAtual >= 0) ? "SALDO POSITIVO" :  "SALDO NEGATIVO";
        System.out.println(resultado);

        scanner.close();
    }
}