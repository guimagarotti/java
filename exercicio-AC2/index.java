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
<<<<<<< HEAD
            System.out.println("[OK]");
            System.out.print("Digite sua senha: ");
            senha = scanner.nextInt();

            if (senha != senhaValid) {
=======
            System.out.println("[ACESSANDO SUA CONTA]");
        }
        
        System.out.print("Digite a senha: ");
        senha = scanner.nextInt();
        
        if (senha != senhaValid) {
            do {
>>>>>>> 5789d70b3be4fbf0ffa222d57095fb3d3882e92f
                
            }
        } else if (senha == senhaValid) {
            System.out.println("NÂO");
        }       
        
    }
}

