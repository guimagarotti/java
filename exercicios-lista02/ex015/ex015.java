import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        int faltasb1, faltasb2, faltasb3, faltasb4, faltasf;
        float notas, mediab1, mediab2, mediab3, mediab4, mediaf;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.println("");
        System.out.println("1º Bimestre ");
        System.out.print("Média do bimestre: ");
        mediab1 = exibe.nextFloat();
        System.out.print("Número de faltas: ");
        faltasb1 = exibe.nextInt();

        System.out.println("");
        System.out.println("2º Bimestre ");
        System.out.print("Média do bimestre: ");
        mediab2 = exibe.nextFloat();
        System.out.print("Número de faltas: ");
        faltasb2 = exibe.nextInt();

        System.out.println("");
        System.out.println("3º Bimestre ");
        System.out.print("Média do bimestre: ");
        mediab3 = exibe.nextFloat();
        System.out.print("Número de faltas: ");
        faltasb3 = exibe.nextInt();

        System.out.println("");
        System.out.println("4º Bimestre ");
        System.out.print("Média do bimestre: ");
        mediab4 = exibe.nextFloat();
        System.out.print("Número de faltas: ");
        faltasb4 = exibe.nextInt();

        faltasf = faltasb1 + faltasb2 + faltasb3 + faltasb4;
        mediaf = (mediab1 + mediab2 + mediab3 + mediab4) / 4;

        System.out.println("");
        System.out.println("RESULTADO FINAL:");
        System.out.println("================");

        if (mediaf >= 7 && mediaf <= 10 && faltasf <= 36) {
            System.out.println("Média final: " + mediaf);
            System.out.println("Faltas: " + faltasf);
            System.out.println("ALUNO APROVADO!");
        } else if (mediaf >= 4 && mediaf <= 7 && faltasf <= 36) {
            System.out.println("Média final: " + mediaf);
            System.out.println("Faltas: " + faltasf);
            System.out.println("ALUNO DE EXAME FINAL!");
        } else {
            System.out.println("Média: " + mediaf);
            System.out.println("Faltas: " + faltasf);
            System.out.println("ALUNO REPROVADO!");
        }
    }
}
