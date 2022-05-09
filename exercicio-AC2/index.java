import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int cpf, cpfValid = 1234567890;
        int senha, senhaValid = 01020304;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================");
        System.out.println("BOAS VINDAS - BANCO AMBROSIA!");
        System.out.println("=============================");

        System.out.print("Digite o CPF: ");
        cpf = scanner.nextInt();

        if (cpf != cpfValid) {
            System.out.println("===================");
            System.out.println("[ERRO] CPF incorreto!");
            System.out.println("ACESSO NÃO PERMITIDO!");
            System.out.println("===================");           
        } else {
            System.out.println(""); 
            System.out.println("[OK]");
            System.out.print("Digite sua senha: ");
            senha = scanner.nextInt();

            if (senha != senhaValid) {
                for (int c = 1; c <= 2; c++) {
                    System.out.println("[ERRO] Senha incorreta!");
                    System.out.print("Digite a senha novamente: ");
                    senha = scanner.nextInt();           
                }
            }
        }        
    }
}

