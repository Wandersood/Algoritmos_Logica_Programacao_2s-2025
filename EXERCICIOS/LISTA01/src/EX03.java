import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, media, nExame;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota");
        n1 = input.nextDouble();
        System.out.println("Digite a nota");
        n2 = input.nextDouble();
        System.out.println("Digite a nota");
        n3 = input.nextDouble();
        System.out.println("Digite a nota");
        n4 = input.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4.0;

        System.out.println("A média do aluno é: " + media);
        if (media >= 7.0) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Digite a nota do exame");
            nExame = input.nextDouble();
            media = (media + nExame) / 2.0;
            System.out.println("A média do aluno é: " + media);
            if (media >= 5) {
                System.out.println("Aluno Aprovado!");
            } else {
                System.out.println("Aluno Reprovado!");
            }
        }

        input.close();
    }
}

