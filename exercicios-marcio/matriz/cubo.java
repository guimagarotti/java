public class cubo {
    public static void main(String[] args) {
        int matriz[][][] = new int[3][3][3];
        int numero = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matriz[i][j][k] = numero;
                    numero++;

                    System.out.printf("\t %d \t", matriz[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
