import java.util.Scanner;

public class crip03 {
    public static void main(String[] args) {
        String msg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a mensagem: ");
        msg = scanner.nextLine();

        System.out.println("Texto original: " + msg);

        System.out.print("Texto cifrado: ");

        for (int c = 0; c < msg.length(); c++) {
            int crip = msg.charAt(c) + 3;
            char change = (char)crip;

            System.out.print(change);
        }
    } 
}
