package ex015;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        int num = 0, soma;
        Scanner exibe = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = exibe.nextInt();

        soma = 0;
        System.out.println(1);
        
        for (int c = 2; c <= num; c++) {
            System.out.println("1/" + c );          
        }
    }
}

