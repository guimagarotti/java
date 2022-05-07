import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        int num, soma = 0, cont = 0;
        float media;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
            if (num > 0) {
                soma += num;
                cont++;
            }
        } while (num > 0);

        media = soma / cont;
        System.out.println(media);
    }
}
