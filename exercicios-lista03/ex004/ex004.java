package ex004;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        String nome;
        float num;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = exibe.nextLine();

        System.out.print("Número de vezes na tela: ");
        num = exibe.nextFloat();

        for (int c = 0; c < num; c++) {
            System.out.println(nome);
        }
    }
}
