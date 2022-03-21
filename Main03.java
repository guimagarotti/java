import java.util.Scanner;

class Main03 {
  public static void main(String[] args) {
    float n, n2;
    Scanner exibe;

    exibe = new Scanner(System.in);

    System.out.print("Digite um valor: ");
    n = exibe.nextFloat();

    n2 = n * 2;
    System.out.println("O dobro de " + n + " é " + n2);
  }
}