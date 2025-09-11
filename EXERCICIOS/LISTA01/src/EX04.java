import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {
        int n1;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        n1 = input.nextInt();
        if (n1 < 1 || n1 > 9) {
            System.out.println("O valor está fora da faixa permitida");
        } else {
            System.out.println("O valor está dentro do valor permitido");
        }
    }
}

