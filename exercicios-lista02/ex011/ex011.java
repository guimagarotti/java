import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        float n1, n2, soma;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        n1 = exibe.nextFloat();

        System.out.print("Segundo número: ");
        n2 = exibe.nextFloat();

        soma = n1 + n2;

        if (soma > 20) {
            soma += 8;
            System.out.println("Soma + 8 : " + soma);
        } else if (soma <= 20) {
            soma -= 5;
            System.out.println("Soma - 5 : " + soma);
        }        
    }
}
