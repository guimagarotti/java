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
            System.out.println("[ACESSANDO SUA CONTA]");
        }
        
        System.out.print("Digite a senha: ");
        senha = scanner.nextInt();
        
        if (senha != senhaValid) {
            do {
                
            }
        } else if (senha == senhaValid) {
            System.out.println("NÂO");
        }       
        
    }
}

