import java.util.Scanner;

public class ac2ex7b {
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

