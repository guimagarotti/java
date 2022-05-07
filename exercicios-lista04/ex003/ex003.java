package ex003;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        float n1, n2, n3, media = 0;
        double codigo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu código: ");
        codigo = scanner.nextDouble();
        
        if (codigo != 0) {
            System.out.println("Código OK!");
            System.out.print("Nota 1: ");
            n1 = scanner.nextFloat();
            System.out.print("Nota 2: ");
            n2 = scanner.nextFloat();
            System.out.print("Nota 3: ");
            n3 = scanner.nextFloat();
            
            media = (n1 + n2 + n3) / 3;
            System.out.println("Média: " + media);
        } else {
            System.out.println("[ERRO] Código inválido!");
        }    
    }
}
