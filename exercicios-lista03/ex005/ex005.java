package ex005;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        int num, soma;
        Scanner exibe;

        exibe = new Scanner(System.in);
        
        soma = 0;
        
        for (int c = 1; c <= 10; c++) {
            System.out.print("Número " + c + ": ");
            num = exibe.nextInt();
            soma = soma + num;
        }

        System.out.println("Soma: " + soma);
    }
}
