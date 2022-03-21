import java.util.Scanner;

class Main01 {
  public static void main(String[] args) {
    String name;
    Scanner exibe;

    exibe = new Scanner(System.in);
    
    System.out.print("Digite seu nome: ");
    name = exibe.nextLine();

    System.out.println("");
    System.out.println("Olá, " + name);
  }
}