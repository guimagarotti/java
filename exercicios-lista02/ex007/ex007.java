import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        String produto;
        double valorproduto, valorporquinho, moedas1real, moedas50cent , moedas25cent, moedas5cent, moedas1cent;
        Scanner exibe;

        exibe = new Scanner(System.in);
        
        System.out.print("Produto: ");
        produto = exibe.next();
        
        System.out.print("Valor do(a) " + produto + ": ");
        valorproduto = exibe.nextDouble();

        System.out.print("Quantas moedas de 1 real no cofre: ");
        moedas1real = exibe.nextDouble() * 1;

        System.out.print("Quantas moedas de 50 centavos no cofre: ");
        moedas50cent = exibe.nextDouble() * 0.5;
        
        System.out.print("Quantas moedas de 25 centavos no cofre: ");
        moedas25cent = exibe.nextDouble() * 0.25;
        
        System.out.print("Quantas moedas de 5 centavos no cofre: ");
        moedas5cent = exibe.nextDouble() * 0.05;

        System.out.print("Quantas moedas de 1 centavo no cofre: ");
        moedas1cent = exibe.nextDouble() * 0.01;

        valorporquinho = moedas1real + moedas50cent + moedas25cent + moedas5cent + moedas1cent;

        if (valorproduto > valorporquinho) {
            System.out.println("Valor do cofre insuficiente!");
        } else {
            System.out.println("É possível comprar o produto!");
        }
    }
}
