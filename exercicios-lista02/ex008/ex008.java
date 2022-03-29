import java.util.Locale;
import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner exibe;
        float C , F;
        int escolha;

        exibe = new Scanner(System.in);
        exibe.useLocale(Locale.US);
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("Escolha [1] ou [2]");
        escolha = exibe.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            C = exibe.nextFloat();

            F = ((float)C * 1.8f) + 32;
            System.out.print("A temperatura em Fahrenheit é: "+C+"º");
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            F = exibe.nextFloat();

            C = (F - 32) / 1.8f;
            System.out.print("A temperatura em Celsius é: " + C + "º");
        }
    }
}


/* import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner exibe;
        float C , F;
        int escolha;

        exibe = new Scanner(System.in);

        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("Escolha [1] ou [2]");
        escolha = exibe.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            C = exibe.nextFloat();

            F = (C * 1.8f) + 32;
            System.out.print("A temperatura em Fahrenheit é: " + F + "º");
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            F = exibe.nextFloat();

            C = (F - 32) / 1.8f;
            System.out.print("A temperatura em Celsius é: " + C + "º");
        }
    }
} */
