import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class doWhile {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            
            if (idade < 18) {
                System.out.println("Não pode entrar!");
            }
        } while(idade < 18);

        System.out.println("Pode entrar!");
    }
}
