package ex002;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        int voto = 0, cand1 = 0, cand2= 0, cand3 = 0, cand4 = 0;
        int branco = 0, nulo = 0;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();
            switch (voto) {
                case 1:
                    cand1 += 1;
                break;
                case 2:
                    cand2 += 1;
                break;
                case 3:
                    cand3 += 1;
                break;
                case 4:
                    cand4 += 1;
                break;
                case 5:
                    branco += 1;
                break;
                case 6:
                    nulo += 1;
                break;
                case 0: 
                    System.out.println("FINALIZANDO...");
                break;          
                default:
                    System.out.println("[ERRO] Voto inválido!");
                break;
            }
        } while (voto != 0);
        
        System.out.println("Candidato 1: " + cand1 + " votos");
        System.out.println("Candidato 2: " + cand2 + " votos");
        System.out.println("Candidato 3: " + cand3 + " votos");
        System.out.println("Candidato 4: " + cand4 + " votos");
        System.out.println("Branco: " + branco);
        System.out.println("Nulos: " + nulo);
    }
}
