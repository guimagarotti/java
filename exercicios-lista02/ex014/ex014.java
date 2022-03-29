import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        float salariomin = 1400, contaluz, desconto, novacontaluz;
        String mes;
        Scanner exibe;

        exibe = new Scanner(System.in);

        System.out.print("De qual mês deseja verificar a conta: ");
        mes = exibe.next();

        contaluz = salariomin / 7;
        desconto = contaluz * 0.1f;
        novacontaluz = contaluz - desconto;

        System.out.println("O valor da sua conta em " + mes + ", com 10% de desconto é " + novacontaluz);
    }
}
