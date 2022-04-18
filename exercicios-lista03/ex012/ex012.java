package ex012;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        int num, pos, neg, zero;
        Scanner exibe = new Scanner(System.in);

        pos = 0;
        neg = 0;
        zero = 0;
        
        for (int c = 1; c <= 10; c++) {
            System.out.print("Número " + c + ": ");
            num = exibe.nextInt();

            if (num == 0) {
                zero += 1;
            }
            if (num > 0) {
                pos += 1;
            }
            if (num < 0) {
                neg += 1;
            }
        }
        
        System.out.println("");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Zeros: " + zero);
    }
}
