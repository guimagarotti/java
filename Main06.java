import java.util.Scanner;

class Main06 {
  public static void main(String args[]) {
    float n1, n2, soma, sub, mult, div;
    Scanner exibe;

    exibe = new Scanner(System.in);

    System.out.print("Primeiro número: ");
    n1 = exibe.nextFloat();

    System.out.print("Segundo número: ");
    n2 = exibe.nextFloat();

    System.out.println("");
    System.out.println("==========");
    System.out.println("OPERAÇÕES:");
    System.out.println("==========");
    
    soma = n1 + n2;
    System.out.println("Soma: " + soma);
    
    sub = n1- n2;
    System.out.println("Subtração: " + sub);
    
    mult = n1 * n2;
    System.out.println("Multiplicação: " + mult);
    
    div = n1 / n2;
    System.out.println("Divisão: " + div); 
  }
}