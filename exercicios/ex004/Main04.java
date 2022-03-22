import java.util.Scanner;

class Main04 {
  public static void main(String[] args) {
    int base, altura, area;
    Scanner exibe;

    exibe = new Scanner(System.in);

    System.out.println("");
    
    System.out.print("Base do retângulo: ");
    base = exibe.nextInt();
    
    System.out.print("Altura do retângulo: ");
    altura = exibe.nextInt();

    area = base * altura;
    System.out.println("A área do retângulo é " + area + " m².");    
  }
}