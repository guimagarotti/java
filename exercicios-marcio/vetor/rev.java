import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Vetor[%d]: ", i);
            System.out.println(vetor[i]);
        }
    }
}
