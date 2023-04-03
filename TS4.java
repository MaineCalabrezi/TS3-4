import java.util.Scanner;

public class TS4 {
    public static void main(String[] args) {
        String linha;
        int num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número: ");
            linha = sc.nextLine();
            try {
                num = Integer.parseInt(linha);
                System.out.println("O número é: " + num);
               break;
            } catch (Exception e) {
                System.out.println("Caracter inválido! ");
            }
        }
    }
}

