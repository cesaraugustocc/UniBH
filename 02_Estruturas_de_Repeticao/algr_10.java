// Escreva um algoritmo que Imprima uma tabela de conversão de polegadas para centímetros, de 1 a 20. Considere que Polegada = Centímetro * 2,54.

public class algr_10 {
    public static void main(String[] args) {
        double polegada = 1;
        double centimetro = 2.54;

        for (polegada = 1; polegada <= 20; polegada++) {
            System.out.println(polegada + " Polegada em Centímetro: " + (polegada * centimetro));
        }
    }
}