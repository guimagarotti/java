/*
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        String texto;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a mensagem: ");
        texto = scanner.nextLine();
        
        System.out.println("Texto original: " + texto);
        
        System.out.print("Texto cifrado: ");
        
        for (int i = 0; i < texto.length(); i++) {
            int cifra = texto.charAt(i) + 5;
            char change = (char)cifra;
            
            System.out.print(change);
        }
    }
}
*/

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        String cifrado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Texto cifrado: ");
        cifrado = scanner.nextLine();

        System.out.print("Texto original: ");

        for (int i = 0; i < cifrado.length(); i++) {
            int decifra = cifrado.charAt(i) - 5;
            char change = (char)decifra;

            System.out.print(change);
        }
    }
}
