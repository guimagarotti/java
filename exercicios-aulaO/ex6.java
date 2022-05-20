import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        char c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        c = scanner.next().charAt(0);
            
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            int numerico = c;
            int c120 = (int)c + 120;
            char converte = (char)c120;
    
            System.out.println("O valor numérico de " + c + " é: " + numerico);
            System.out.println("O valor de " + c + ", 120 casas a frente, vale: " + converte);            
            
            String charToString = Character.toString(converte);
            System.out.println("Letra maiúscula: " + charToString.toUpperCase());
            System.out.println("Letra minúscula: " + charToString.toLowerCase());
    
            if (c >= 'A' && c <= 'Z') {
                System.out.println("Letra alternada: " + charToString.toLowerCase());
            } else if (c >= 'a' && c <= 'z') {
                System.out.println("Letra alternada: " + charToString.toUpperCase());
            }
        }
    }
}
