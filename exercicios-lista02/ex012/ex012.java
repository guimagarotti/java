import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        float salario, valoremprestimo, prestacao;
        float valorparcela;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Salário: ");
        salario = exibe.nextFloat();

        System.out.print("Valor do empréstimo: ");
        valoremprestimo = exibe.nextFloat();
        
        System.out.print("Número de prestações: ");
        prestacao = exibe.nextFloat();

        valorparcela = valoremprestimo / prestacao;
        
        if (valorparcela > salario*0.3) {
            System.out.print("Empréstimo não concebível!");
        } else {
            System.out.print("Empréstimo concebível, com parcelas de " + valorparcela);
        }        
    }
}
