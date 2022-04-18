package ex009;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        int num, par, impar;
        Scanner exibe = new Scanner(System.in);
        
        par = 0;
        impar = 0;
        
        for (int c = 1; c <= 20; c++) {
            System.out.print("Número " + c + ": ");
            num = exibe.nextInt();
            
            if (num % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }

        System.out.println(par + " números pares");
        System.out.println(impar + " números ímpares");
    }
}
