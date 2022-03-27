import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;
        Scanner exibe;
    
        exibe = new Scanner(System.in);
    
        System.out.print("Nota 1: ");
        n1 = exibe.nextFloat();
    
        System.out.print("Nota 2: ");
        n2 = exibe.nextFloat();
    
        System.out.print("Nota 3: ");
        n3 = exibe.nextFloat();
    
        System.out.print("Nota 4: ");
        n4 = exibe.nextFloat();
    
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

