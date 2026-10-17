// Um restaurante da cidade construiu um cardápio eletrônico e atribuiu um número para cada prato disponível. 
// Construa um algoritmo que apresente o cardápio de opções na tela ( considere 4 pratos numerados de 1 a 4 ), leia a escolha do usuário e escreva qual a opção escolhida.

import java.util.Scanner;

public class algr_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("RESTAURANTE DO MINHOCAO - SABOR DA GORDURA\n\n1 - (10x) HAMBURGUER EXPLOSAO SABOR (Serve 1 locomotiva) - R$ 220,22");
        System.out.println("2 - (20x) OVOS SUBMERSOS NA GORDURA _ ARTESANAL (Prato Entrada) - R$ 59,13");
        System.out.println("3 - (5x) - LASANHAZINHA 1KG + 3L COCA COLA (Recomendado pela nutri) - R$ 130,13");
        System.out.println("4 - (20KG) - FRUTINHAS MISTAS FIT POS ALMOÇO ('inadmissel nao comer) - R$ 22,13");
        
        System.out.print("\nDIGITE A OPÇAO DESEJADA NO CARDAPIO: ");
        byte numeroMenu = scanner.nextByte();

        switch (numeroMenu) {
            case 1:
                System.out.println("\nVocê escolheu - (10x) HAMBURGUER EXPLOSAO SABOR\nTotal: R$ 220,22");
                break;

            case 2:
                System.out.println("\nVocê escolheu - (20x) OVOS SUBMERSOS NA GORDURA _ ARTESANAL\nTotal: R$ 59,13");
                break;

            case 3:
                System.out.println("\nVocê escolheu - (5x) - LASANHAZINHA 1KG + 3L COCA COLA\nTotal: R$ 130,13");
                break;

            case 4:
                System.out.println("\nVocê escolheu - (20KG) - FRUTINHAS MISTAS FIT POS ALMOÇO\nTotal: R$ 22,13");
                break;
        
            default:
                System.out.println("Opção Inválida");
        }

        scanner.close();
    }
}