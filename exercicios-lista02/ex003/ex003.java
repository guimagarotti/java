import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        float n1, n2, n3, media;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Nota 1: ");
        n1 = exibe.nextFloat();

        System.out.print("Nota 2: ");
        n2 = exibe.nextFloat();

        System.out.print("Nota 3: ");
        n3 = exibe.nextFloat();

        media = (n1 + n2 + n3) / 3;
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
