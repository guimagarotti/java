import java.util.Scanner;

class Main07 {
  public static void main(String args[]) {
    float C, F;
    Scanner exibe;

    exibe = new Scanner(System.in);

    System.out.print("Digite a temperatura em Celsius: ");
    C = exibe.nextFloat();

    F = (C * 9/5) + 32;

    System.out.println("");
    System.out.println("==========");
    System.out.println("CONVERSÃO:");
    System.out.println("==========");
    System.out.println("A temperatura em Fahrenheit vale: " + F); 
  }
}