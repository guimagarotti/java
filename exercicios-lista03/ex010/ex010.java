package ex010;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        int num, dados;
        Scanner exibe = new Scanner(System.in);

        dados = 0;
        
        for (int c = 1; c <= 20; c++) {
            System.out.print("Número " + c + ": ");
            num = exibe.nextInt();

            if (num >= 0 && num <= 100) {
                dados += 1;
            }
        }

        System.out.println("São " + dados + " números entre 0 e 100");        
    }
}
