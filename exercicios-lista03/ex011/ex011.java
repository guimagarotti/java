package ex011;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        int num, tabuada;
        Scanner exibe = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        num = exibe.nextInt();

        tabuada = 0;
        
        for (int c = 0; c <= 10; c++) {
            tabuada = num * c;
            System.out.println(num + " x " + c + " = " + tabuada);
        }
    }
}
