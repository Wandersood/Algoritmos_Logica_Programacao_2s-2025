import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o tipo de cliente ('A' - Associado, 'N' - Não Associado, 'P' - Parceiro Comercial): ");
        String pessoa = scanner.next().trim().toUpperCase();
        char tipoCliente = pessoa.charAt(0);

        if (tipoCliente != 'A' && tipoCliente != 'N' && tipoCliente != 'P') {
            System.out.println("Tipo de cliente inválido! Digite apenas A, P ou N.");
            scanner.close();
            return;
        }

        System.out.print("Digite o valor total da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorFinal = valorCompra;
        double percentualDesconto = 0;

        switch (tipoCliente) {
            case 'A':
                System.out.println("\nCliente é Associado Ativo. Aplicando desconto!");
                percentualDesconto = 0.15;
                valorFinal = valorCompra * (1 - percentualDesconto);
                break;
            case 'P':
                System.out.println("\nCliente é Parceiro Comercial. Aplicando desconto!");
                percentualDesconto = 0.10;
                valorFinal = valorCompra * (1 - percentualDesconto);
                break;
            case 'N':
                System.out.println("\nCliente não é associado. Sem desconto aplicável.");
                break;
            default:
                System.out.println("\nTipo de cliente inválido. Nenhum desconto será aplicado.");
                break;
        }

        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor Original: R$ " + valorCompra);
        if (percentualDesconto > 0) {
            System.out.println("Desconto Aplicado (" + (int) (percentualDesconto * 100) + "%): " + (valorCompra * percentualDesconto));
        }
        System.out.println("Valor Final: R$" + valorFinal);

        if (valorFinal > 500) {
            System.out.println("\nSua compra ultrapassou R$ 500,00 e opções de parcelamento estão disponíveis.");
            System.out.print("Digite o número de parcelas desejadas (até 6x): ");
            int numParcelas = scanner.nextInt();

            if (numParcelas >= 1 && numParcelas <= 3) {
                double valorParcela = valorFinal / numParcelas;
                System.out.println("\nPagamento em " + numParcelas + "x sem juros de R$ " + valorParcela);
            } else if (numParcelas >= 4 && numParcelas <= 6) {
                double valorFinalComJuros = valorFinal * 1.18;
                double valorParcela = valorFinalComJuros / numParcelas;
                System.out.println("\nPagamento em " + numParcelas + "x com juros de 18%.");
                System.out.println("Valor total com juros: R$" + valorFinalComJuros);
                System.out.println("Cada parcela será de: R$" + valorParcela);
            } else {
                System.out.println("\nNúmero de parcelas inválido. O pagamento será considerado à vista.");
            }
        } else {
            System.out.println("\nPagamento à vista.");
        }
        System.out.println("\n--- Obrigado por comprar conosco! ---");
        scanner.close();
    }
}

