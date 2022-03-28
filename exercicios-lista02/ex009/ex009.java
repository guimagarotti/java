import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        int num;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = exibe.nextInt();

        if (num % 2 == 0) {
            System.out.print("PAR!");
        } else {
            System.out.print("ÍMPAR!");
        }
    }
}
