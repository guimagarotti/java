package ex013;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        int num, maior = 0, menor = 0;
        Scanner exibe = new Scanner(System.in);
      
        for (int c = 1; c <= 10; c++) {
            System.out.print("Número " + c + ": ");
            num = exibe.nextInt();

            if (c == 1) {
                maior = num;
                menor = num;
            }
            
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
