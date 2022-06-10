import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        int num, totNum = 0;
        float media = 0, soma = 0;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
            
            if (num % 2 == 0 && num != 0) {
                totNum++;
                soma += num;
                media = soma / totNum;
            }
        } while (num != 0);

        System.out.println("Média: " + media);
    }
}
