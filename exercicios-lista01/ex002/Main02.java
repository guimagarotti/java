import java.util.Scanner;

class Main02 {
  public static void main(String[] args) {
    char letra;
    Scanner exibe;
    
    exibe = new Scanner(System.in);
    
    System.out.print("Digite uma letra do alfabeto: ");
    letra = exibe.next().charAt(0);

    System.out.println("");
    System.out.println("Você digitou a letra " + letra);
  }
}