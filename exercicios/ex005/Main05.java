import java.util.Scanner;

class Main05 {
  public static void main(String[] args) {
    int num, antNum, sucNum;
    Scanner exibe;

    exibe = new Scanner(System.in);

    System.out.print("Digite um número: ");
    num = exibe.nextInt();

    System.out.println("");
    
    antNum = num - 1;
    System.out.println("O antecessor é " + antNum);

    sucNum = num + 1;
    System.out.println("O sucessor é " + sucNum);    
  }
}