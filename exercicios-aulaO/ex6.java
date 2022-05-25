import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        char caractere;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        caractere = scanner.next().charAt(0);
            
        if ((caractere >= 'A' && caractere <= 'Z') || (caractere >= 'a' && caractere <= 'z')) {
            // LETRA
            int inteiro = (int)caractere;
            int c120A = caractere + 120;
            char converteA = (char)c120A;
    
            System.out.println("O valor numérico de " + caractere + " é: " + inteiro); // A
            
            String charToString = Character.toString(caractere);
            System.out.println("Letra maiúscula: " + charToString.toUpperCase()); // C
            System.out.println("Letra minúscula: " + charToString.toLowerCase()); // D
            
            if (caractere >= 'A' && caractere <= 'Z') {
                System.out.println("Letra Alternada: " + charToString.toLowerCase()); // E
            } else {
                System.out.println("Letra Alternada: " + charToString.toUpperCase()); // E
            }
            
            System.out.println("O valor de " + caractere + ", 120 casas a frente, vale: " + converteA); // B
        } else if (caractere >= '1' && caractere <= '9') {
            // NUMERO
            int c120B = caractere + 120;
            char converteB = (char)c120B;
            
            System.out.println("O valor numérico de " + caractere + " é: " + caractere); // A
            System.out.println("O valor de " + caractere + ", 120 casas a frente, vale: " + converteB); // B         
        }


    }
}
