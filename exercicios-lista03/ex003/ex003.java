package ex003;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        String nome;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = exibe.nextLine();

        for (int c = 0; c < 10; c++) {
            System.out.println(nome);        
        }
    }
}
