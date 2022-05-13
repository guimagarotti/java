import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        String cpf = "12345678900", senha = "01020304";
        String cpfUser, senhaUser;
        int saldo = 1000, opcao;

        Scanner exibe = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Boas Vindas! - Banco AMBROSIA");
        System.out.println("==========================");

        System.out.print("Insira o CPF: ");
        cpfUser = exibe.nextLine();

        if (!cpfUser.equals(cpf)) {
            // https://www.w3schools.com/java/ref_string_equals.asp#:~:text=The%20equals()%20method%20compares,to%20compare%20two%20strings%20lexicographically.
            System.out.println("[ERRO] CPF inválido!");
        } else {
            System.out.println("======================");
            for (int c = 1; c <= 2; c++) {
                System.out.print("Informe a senha: ");
                senhaUser = exibe.nextLine();

                if (senhaUser.equals(senha)) {
                    break;
                    // https://www.w3schools.com/java/ref_string_equals.asp#:~:text=The%20equals()%20method%20compares,to%20compare%20two%20strings%20lexicographically.
                } else if (c == 1) {
                    System.out.println("");
                    System.out.println("[CUIDADO] Apenas mais uma tentativa!");
                } else if (c == 2) {
                    System.out.println("");
                    System.out.println("================");
                    System.out.println("Conta BLOQUEADA!");
                    System.out.println("================");
                    System.exit(1); //https://www.delftstack.com/pt/howto/java/java-end-program/#:~:text=Para%20terminar%20um%20programa%20Java,actual%20que%20estamos%20a%20executar.
                }
            }

            System.out.println("=================");
            System.out.println("MENU DE OPERAÇÕES");
            System.out.println("=================");
            System.out.println("[1] Saldo");
            System.out.println("[2] Depósito");
            System.out.println("[3] Saque");
            System.out.println("[0] Sair");
            System.out.println("Escolha uma opção acima: ");
            opcao = exibe.nextInt();

            if (opcao < 0 || opcao > 3) {
                System.out.println("[ERRO] Opção inválida!");
            } else {
                switch (opcao) {
                    case 1:

                    break;
                    case 2:

                    break;
                    case 3:

                    break;

                    case 0:
                    
                    break;
                }
            }
        }
    }
}
