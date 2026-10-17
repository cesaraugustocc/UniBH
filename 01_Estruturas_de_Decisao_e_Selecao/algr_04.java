/*
Implemente um programa, que permita ao usuário ingressar os dados de dureza, teor de carvão e a resistência da tração e como saída mostre a pontuação do aço. 

O grau do aço é obtido em base às seguintes condições:

Dureza deve ser maior que 50

Teor de Carvão deve ser menor que 0.7

Resistencia à tração deve ser maior que 5600

As pontuações são obtidas da seguinte forma:

Pontuação é 10 se todas as condições são cumpridas

Pontuação é 9 se as condições (i) e (ii) são cumpridas

Pontuação é 8 se as condições (ii) e (iii) cumpridas

Pontuação é 7 se as condições (i) e (iii) cumpridas

Pontuação é 6 se somente uma condição é cumprida

Pontuação é 5 se nenhuma das condições são cumpridas */

import java.util.Scanner;

public class algr_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Digite a dureza: ");
        float dureza = scanner.nextFloat();

        System.out.print("Digite o teor de carvao: ");
        float teorCarvao = scanner.nextFloat();

        System.out.print("Digite a resistência de traçao: ");
        float resistenciaTracao = scanner.nextFloat();

        Boolean condicao1 = dureza > 50; 
        Boolean condicao2 = teorCarvao < 0.7;
        Boolean condicao3 = resistenciaTracao > 5600;

        int pontuacao = 0;

        if (condicao1 && condicao2 && condicao3){
            pontuacao = 10;
        }else if(condicao1 && condicao2){
            pontuacao = 9;
        }else if(condicao2 && condicao3){
            pontuacao = 8;
        }else if(condicao1 && condicao3){
            pontuacao = 7;
        }else if(condicao1||condicao2||condicao3){
            pontuacao = 6;
        }else{
            pontuacao = 5;
        }

        System.out.println("\nPontuaçao: "+pontuacao);

        scanner.close();
    }
}
