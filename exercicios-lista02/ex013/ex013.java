import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        float preçoproduto, lucro, novopreco;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("Qual o preço produto: ");
        preçoproduto = exibe.nextFloat();

        lucro = 0;
        
        if (preçoproduto < 20) {
            lucro = preçoproduto * 0.45f;
            novopreco = preçoproduto + lucro;
            System.out.println("O valor da venda, com lucro de 45%, será " + novopreco);

        } else {
            lucro = preçoproduto * 0.3f;
            novopreco = preçoproduto + lucro;
            System.out.println("O valor da venda, com lucro de 30%, será " + novopreco);
        }
    }
}
