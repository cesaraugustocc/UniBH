// Ingresse um número e mostre o dia da semana (Resolva com switch-case)

import java.util.Scanner;

public class algr_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 - 7: ");
        byte diaSemana = scanner.nextByte();

        switch (diaSemana) {
            case 1:
                System.out.println("\nDomingo");
                break;
            case 2:
                System.out.println("\nSegunda-feira");
                break;
            case 3:
                System.out.println("\nTerça-feira");
                break;
            case 4:
                System.out.println("\nQuarta-feira");
                break;
            case 5:
                System.out.println("\nQuinta-feira");
                break;
            case 6:
                System.out.println("\nSexta-feira");
                break;
            case 7:
                System.out.println("\nSábado-feira");
                break;
            default:
                System.out.println("\nOpçao inválida.");
        }

        scanner.close();
    }
}