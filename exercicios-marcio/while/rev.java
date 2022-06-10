import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        int num = 0, soma = 0, totNum = 0, mult = 0; 
        Scanner scanner = new Scanner(System.in);
        
        while (num == 0) {
            System.out.println("Digite um número inteiro: ");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                soma += num;
                totNum++;
                mult = soma * totNum;
                System.out.println(soma + " * " + totNum + " = " + mult);
            }
        }
    }
}
