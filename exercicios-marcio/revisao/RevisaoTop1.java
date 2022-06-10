package revisao;

public class RevisaoTop1 {
    public static void main(String[] args) {
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matrizR[][] = new int[3][3];
        int auxMatriz1 = 1, auxMatriz2 = 10;
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; i++) {
                matriz1[i][j] = auxMatriz1;
                auxMatriz1++;
    
                matriz2[i][j] = auxMatriz2;
                auxMatriz2 += 10;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizR[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.printf("\t %d \t", matrizR[i][j]);
            }
            System.out.println();
        }
    }
}

