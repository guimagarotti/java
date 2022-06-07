public class switch_case {
    public static void main(String[] args) {
        /*int day = 7;

        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
            */

            String fruta = "abaxaqui";

            switch (fruta) {
                case "banana":
                    System.out.println("Amarelo");
                    break;
                case "morango":
                    System.out.println("Vermelho");
                    break;
                case "abaxaqui":
                    System.out.println("Verde");
                    break;
                default:
                    System.out.println("Estranho");
                    break;
            }
        }
    }
