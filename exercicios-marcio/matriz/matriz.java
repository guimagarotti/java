import javax.sound.sampled.SourceDataLine;

public class matriz {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;

        matriz[1][0] = 40;
        matriz[1][1] = 50;
        matriz[1][2] = 60;

        matriz[2][0] = 70;
        matriz[2][1] = 80;
        matriz[2][2] = 90;

        for (int i = 0; i < 3; i++) { // LINHA
            for (int j = 0; j < 3; j++) { // COLUNA
                System.out.printf("\t %d \t", matriz[i][j]); 
            }
            System.out.println();
        }
    }
}
