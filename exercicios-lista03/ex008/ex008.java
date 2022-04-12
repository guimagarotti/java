package ex008;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        int idade, maior18;
        Scanner exibe;

        exibe = new Scanner(System.in);

        maior18 = 0;
        
        for (int c = 1; c <= 20; c++) {
            System.out.print("Idade " + c + ": ");
            idade = exibe.nextInt();
            
            if (idade >= 18) {
                maior18++;
            }
        }
        System.out.print(maior18 + " pessoas são maiores de idade");
    }
}
