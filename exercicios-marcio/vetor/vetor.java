/*
public class vetor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;
        
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
        System.out.println("numeros[2] = " + numeros[2]);
        System.out.println("numeros[3] = " + numeros[3]);
        System.out.println("numeros[4] = " + numeros[4]);
        System.out.println("numeros[5] = " + numeros[5]);
        System.out.println("numeros[6] = " + numeros[6]);
        System.out.println("numeros[7] = " + numeros[7]);
        System.out.println("numeros[8] = " + numeros[8]);
        System.out.println("numeros[9] = " + numeros[9]);
    }
}
*/
import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("");
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + i + ": " + nomes[i]);
        }

    }
}
