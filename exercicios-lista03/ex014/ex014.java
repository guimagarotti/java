package ex014;

public class ex014 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, prox;
        
        for (int c = 0; c < 100; c++) {
            prox = n1 + n2;
            n1 = n2;
            n2 = prox;

            System.out.println(n1);        
        }
    }
}
