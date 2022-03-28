import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Número 1: ");
        n1 = exibe.nextFloat();

        System.out.print("Número 2: ");
        n2 = exibe.nextFloat();

        System.out.print("Número 3: ");
        n3 = exibe.nextFloat();

        if (n2 < n1 && n1 > n3) {
            System.out.print("O maior número é: " + n1);
        } else if (n1 < n2 && n2 > n3) {
            System.out.print("O maior número é: " + n2);
        } else if (n1 < n2 && n3 > n2) {
            System.out.print("O maior número é: " + n3);
        }    
    }
}
