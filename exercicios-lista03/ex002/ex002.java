package ex002;

public class ex002 {
    public static void main(String[] args) {
        int soma;

        soma = 0;
        
        for (int c = 0; c <= 15; c++) {
            soma = soma + c;
            System.out.println(c);
        }

        System.out.println("Soma: " + soma);
    }
}
