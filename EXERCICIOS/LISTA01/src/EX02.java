import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, sub;

        System.out.println("Digite o primeiro valor");
        n1 = input.nextInt();
        System.out.println("Digite o segundo valor");
        n2 = input.nextInt();
        input.close();

        if (n1 == n2) {
            System.out.println("Os valores são iguais, o resultado será 0");
        } else {
            if (n1 > n2) {
                sub = n1 - n2;
            } else {
                sub = n2 - n1;
            }
            System.out.println("O valor da diferenca é: " + sub);
        }
    }
}
