import java.util.Scanner;

class Main08 {
  public static void main(String[] args) {
    float n1, n2, n3, n4, media;
    Scanner exibe;

    exibe = new Scanner(System.in);
    
    System.out.print("Digite a 1ª nota: ");
    n1 = exibe.nextFloat();
    
    System.out.print("Digite a 2ª nota: ");
    n2 = exibe.nextFloat();
    
    System.out.print("Digite a 3ª nota: ");
    n3 = exibe.nextFloat();
    
    System.out.print("Digite a 4ª nota: ");
    n4 = exibe.nextFloat();

    media = (n1 + n2 + n3 + n4) / 4;

    System.out.println("");
    System.out.println("=======================");
    System.out.println("Sua média foi de: " + media);
    System.out.println("=======================");    
  }
}