import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;
        Scanner exibe;
        
        exibe = new Scanner(System.in);
        
        do {
            System.out.print("Nota 1: ");
            n1 = exibe.nextFloat();
        } while (n1 < 0 || n1 > 10);
        
        do {
            System.out.print("Nota 2: ");
            n2 = exibe.nextFloat();
        } while (n2 < 0 || n2 > 10);
        
        do {
            System.out.print("Nota 3: ");
            n3 = exibe.nextFloat();
        } while (n3 < 0 || n3 > 10);
        
        do {
            System.out.print("Nota 4: ");
            n4 = exibe.nextFloat();
        } while (n4 < 0 || n4 > 10);
        
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Média: " + media);
        
        if (media >= 7) {
            System.out.println("ALUNO APROVADO!");
        } else if (media >= 5 && media < 7) {
            System.out.println("ALUNO DE EXAME FINAL!");
        } else {
            System.out.println("ALUNO REPROVADO!");
        }
    }
}
