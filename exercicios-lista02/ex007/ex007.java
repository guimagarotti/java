import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        String produto;
        float valor, real, centavos, cofre = 255;
        Scanner exibe;

        exibe = new Scanner(System.in);
        
        System.out.print("Produto: ");
        produto = exibe.next();
        
        System.out.print("Valor do(a) " + produto + ": ");
        valor = exibe.nextFloat();

        if (valor > cofre) {
            System.out.println("Valor do cofre insuficiente!");
        }
    }
}
