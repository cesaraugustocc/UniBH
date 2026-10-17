// Algr_01 com if-else

import java.util.Scanner;

public class algr_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maças compradas: ");
        int maca = scanner.nextInt();

        if (maca < 12){
            System.out.println("\nValor total: R$ "+ maca*1.3);
        }else{
            System.out.println("\nValor total: R$ "+maca);
        }
        scanner.close();
    }
}