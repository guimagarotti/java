import java.util.Scanner;

public class banco {
    public static void main(String[] args) throws InterruptedException {
        String cpf = "12345678900", senha = "01020304";
        String cpfUser, senhaUser;
        int saldo = 1000, opcao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Boas Vindas! - Banco AMBROSIA");
        System.out.println("==========================");

        System.out.print("Insira o CPF: ");
        cpfUser = scanner.nextLine();

        if (!cpfUser.equals(cpf)) {
            // https://www.w3schools.com/java/ref_string_equals.asp#:~:text=The%20equals()%20method%20compares,to%20compare%20two%20strings%20lexicographically.
            System.out.println("[ERRO] CPF inválido!");
        } else {
            System.out.println("======================");
            for (int c = 1; c <= 2; c++) {
                System.out.print("Informe a senha: ");
                senhaUser = scanner.nextLine();

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
            System.out.print("Escolha uma opção acima: ");
            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 3) {
                System.out.println("[ERRO] Opção inválida!");
            } else {
                switch (opcao) {
                    case 1:
                        System.out.println("");    
                        System.out.println("==================");
                        System.out.println("SALDO ATUAL: " + saldo);
                        System.out.println("==================");
                        System.out.println("OBRIGADO!");
                    break;
                    case 2:
                        float deposito, novoSaldoD;

                        System.out.println("");    
                        System.out.println("================");
                        System.out.println("ÁREA DE DEPÓSITO");
                        System.out.println("================");
                        System.out.print("Valor do depósito: R$ ");
                        deposito = scanner.nextFloat();

                        if (deposito < 0) {
                            System.out.println("[ERRO] Valor inválido!");
                            break;
                        } else {
                            novoSaldoD = saldo + deposito;
                            System.out.println("");
                            System.out.println("Você depositou R$" + deposito);
                            System.out.println("");
                            System.out.println("NOVO SALDO: R$ " + novoSaldoD);
                            System.out.println("OBRIGADO!");
                            break;
                        }
                    case 3:
                        float saque, novoSaldoS; 
                    
                        System.out.println("");    
                        System.out.println("=============");
                        System.out.println("ÁREA DE SAQUE");
                        System.out.println("=============");
                        System.out.print("Valor do saque: R$ ");
                        saque = scanner.nextFloat();

                        if (saque < 0 || saque > saldo) {
                            System.out.println("[ERRO] Valor inválido!");
                            break;
                        } else {
                            novoSaldoS = saldo - saque;
                            System.out.println("");
                            System.out.println("Você sacou R$" + saque);
                            System.out.println("");
                            System.out.println("NOVO SALDO: R$ " + novoSaldoS);
                            System.out.println("OBRIGADO!");
                            break;
                        }
                    case 0:
                        System.out.println("");
                        System.out.println("[FINALIZANDO...]");
                        System.exit(1);
                    break;
                }
            }
        }
    }
}
