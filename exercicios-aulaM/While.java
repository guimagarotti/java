import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int idade = 15;
        Scanner scanner = new Scanner(System.in);

        while (idade < 18) {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println("Não entra otario");
        }
    }
}
