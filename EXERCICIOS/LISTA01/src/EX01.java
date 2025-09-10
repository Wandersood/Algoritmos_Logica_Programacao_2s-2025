import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vA, vB, vC, vNulo, vBranco, vValidosTotal, vTotalEleitores;
        double percA, percB, percC, percBrancos, percNulos;

        System.out.println("Digite a quantidade de votos para o candidato A: ");
        vA = input.nextInt();
        System.out.println("Digite a quantidade de votos para o candidato B: ");
        vB = input.nextInt();
        System.out.println("Digite a quantidade de votos para o candidato C: ");
        vC = input.nextInt();
        System.out.println("Digite a quantidade de votos nulos: ");
        vNulo = input.nextInt();
        System.out.println("Digite a quantidade de votos em branco: ");
        vBranco = input.nextInt();

        input.close();

        vValidosTotal = vA + vB + vC;
        vTotalEleitores = vA + vB + vC + vBranco + vNulo;
        percA = vA * 100.0 / vTotalEleitores;
        percB = vB * 100.0 / vTotalEleitores;
        percC = vC * 100.0 / vTotalEleitores;
        percBrancos = vBranco * 100.0 / vTotalEleitores;
        percNulos = vNulo * 100.0 / vTotalEleitores;

        System.out.println("\n======================================");
        System.out.println("      RESULTADOS FINAIS DA ELEIÇÃO      ");
        System.out.println("======================================");

        System.out.println("\n--- Resumo dos Votos (Absolutos) ---");
        System.out.println("Votos para o Candidato A: " + vA);
        System.out.println("Votos para o Candidato B: " + vB);
        System.out.println("Votos para o Candidato C: " + vC);
        System.out.println("Votos em Branco: " + vBranco);
        System.out.println("Votos Nulos: " + vNulo);
        System.out.println("--------------------------------------");
        System.out.println("Total de Votos Válidos: " + vValidosTotal);
        System.out.println("Total de Eleitores: " + vTotalEleitores);

        System.out.println("\n--- Análise Percentual (sobre o total de eleitores) ---");

        System.out.printf("Percentual do Candidato A:   %.2f%%\n", percA);
        System.out.printf("Percentual do Candidato B:   %.2f%%\n", percB);
        System.out.printf("Percentual do Candidato C:   %.2f%%\n", percC);
        System.out.printf("Percentual de Votos em Branco: %.2f%%\n", percBrancos);
        System.out.printf("Percentual de Votos Nulos:   %.2f%%\n", percNulos);
        System.out.println("======================================");
    }
}
