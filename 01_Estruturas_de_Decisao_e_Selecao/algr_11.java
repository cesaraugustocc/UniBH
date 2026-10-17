/*Dados três valores, X, Y, Z, verificar se eles podem ser os comprimentos dos lados de um triangulo. Verificar se é um triângulo eqüilátero, isósceles ou escaleno. 
Se eles não formarem um triângulo, escrever uma mensagem. Antes de começar a elaboração do algoritmo, toma-se necessária a revisão de algumas propriedades e definições. 
O comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados. 
Chama-se triângulo eqüilátero ao triângulo que tem os comprimentos dos três lados iguais. Chama-se triângulo isósceles ao triângulo que tem os comprimentos de dois lados iguais. 
Portanto, todo triângulo eqüilátero é também isósceles. Chama-se triângulo escaleno ao triângulo que tem os comprimentos de seus três lados diferentes. */

import java.util.Scanner;

public class algr_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        float x = scanner.nextFloat();

        System.out.print("Digite o valor de Y: ");
        float y = scanner.nextFloat();

        System.out.print("Digite o valor de Z: ");
        float z = scanner.nextFloat();

        if (x <= 0 || y <= 0 || z <= 0 || x >= y + z || y >= x + z || z >= x + y){
            System.out.println("NAO É UM TRIANGULO");
        }else if (x == y && x == z){
            System.out.println("TRIANGULO EQUILATERO");
        }else if (x != y && x != z && y != z){
            System.out.println("TRIANGULO ESCALENO");
        }else{
            System.out.println("TRIANGULO ISOSCELES");
        }

        scanner.close();
    }
}