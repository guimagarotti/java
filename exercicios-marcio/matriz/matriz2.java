public class matriz2 {
    public static void main(String[] args) {
        // Matriz Declarada
        int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t %d \t", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
