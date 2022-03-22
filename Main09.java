import java.util.Scanner;

class Main09 {
  public static void main(String[] args) {
    String p1, p2;
    float n1, n2, soma;
    Scanner exibe;

    exibe = new Scanner(System.in);

    System.out.println("");
    System.out.println("=========");
    System.out.println("PRODUTOS:");
    System.out.println("=========");
    
    System.out.print("Primeiro produto: ");
    p1 = exibe.nextLine();

    System.out.print("Segundo produto: ");
    p2 = exibe.nextLine();

    System.out.println("");
    System.out.println("=======");
    System.out.println("PREÇOS:");
    System.out.println("=======");

    System.out.print("Preço do(a) " + p1 + ": ");
    n1 = exibe.nextFloat();

    System.out.print("Preço do(a) " + p2 + ": ");
    n2 = exibe.nextFloat();

    System.out.println("");
    System.out.println("=======");
    System.out.println("GASTOS:");
    System.out.println("=======");
    
    soma = n1 + n2;
    System.out.println("Você gastou no total R$" + soma);  
  }
}