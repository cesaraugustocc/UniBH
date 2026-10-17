// // algr_06 com if-else

import java.util.Scanner;

public class algr_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("\nMAIOR DE IDADE");
        }else{
            System.out.println("\nMENOR DE IDADE");
        }

        scanner.close();
    }
}