import java.util.Scanner;

public class exemplo_switch {
    public static void main(String[] args) {
        int opcao, n1, n2;
        float soma, sub, mult, div;
        Scanner exibe = new Scanner(System.in);

        System.out.print("Número 1: ");
        n1 = exibe.nextInt();
        System.out.print("Número 2: ");
        n2 = exibe.nextInt();

        System.out.println("");
        System.out.println("Escolha uma opção:");
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        opcao = exibe.nextInt();

        System.out.println("");
        switch (opcao) {
            case 1:
                soma = n1 + n2;    
                System.out.println(soma);
            break;
            case 2:
                sub = n1 - n2;
                System.out.println(sub);
            break;
            case 3:
                mult = n1 * n2;
                System.out.println(mult);
            break;
            case 4:
                div = n1 / n2;
                System.out.println(div);
            break;
            default:
                System.out.println("[ERRO]");
            break;
        }        
    }
}
