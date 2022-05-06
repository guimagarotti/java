import java.util.Scanner;

public class ovidio02 {
    public static void main(String[] args) {
        String texto;
        Scanner exibe = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        texto = exibe.nextLine();
        
        int i = texto.charAt(0) + 12;

        System.out.println((char)i);
    }
}
