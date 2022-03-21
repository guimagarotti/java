import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    String nome;
    float peso;
    double altura;
    int idade;
    Scanner exibe;

    exibe = new Scanner(System.in);

    System.out.print("Nome: ");
    nome = exibe.nextLine();
    
    System.out.print("Idade: ");
    idade = exibe.nextInt();
    
    System.out.print("Peso: ");
    peso = exibe.nextFloat();
    
    System.out.print("Altura: ");
    altura = exibe.nextDouble();
    
    System.out.println("");

    System.out.println("=======================");
    System.out.println("         DADOS         ");
    System.out.println("=======================");
    
    System.out.println("Olá, " + nome + ".");
    System.out.println("Você tem " + idade + " anos.");
    System.out.println("Pesa " + peso + " Kg.");
    System.out.println("Mede " + altura + " m.");      
  }
}