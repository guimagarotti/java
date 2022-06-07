public class vetorFor {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int valor = 10;

        for (int c = 0; c < 100; c++) {
            numeros[c] = valor;
            valor = valor + 10;
        }
        
        for (int c = 0; c < 100; c++) {
            System.out.println(numeros[c]);
        }
    }
}
