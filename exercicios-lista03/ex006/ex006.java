package ex006;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        int idade, soma;
        Scanner exibe;

        exibe = new Scanner(System.in);
        
        soma = 0;
        for (int c = 1; c <= 20; c++) {
            System.out.print("Idade " + c + ": ");
            idade = exibe.nextInt();

            soma = soma + idade;
        }

        System.out.println("Soma: " + soma);
    }
}
