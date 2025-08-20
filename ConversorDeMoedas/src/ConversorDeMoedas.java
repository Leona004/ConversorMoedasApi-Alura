import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Moedas ===");
        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar (USD)");
        System.out.println("2 - Euro (EUR)");
        System.out.println("3 - Libra (GBP)");
        System.out.println("4 - Iene (JPY)");

        int opcao = scanner.nextInt();
        System.out.print("Digite o valor em Reais (BRL): ");
        double valorEmReais = scanner.nextDouble();

        double taxaDeCambio = 0;

        switch (opcao) {
            case 1 -> {
                taxaDeCambio = 5.20; // Exemplo: 1 USD = 5.20 BRL
                System.out.println("Convertendo para Dólar...");
            }
            case 2 -> {
                taxaDeCambio = 5.50; // Exemplo: 1 EUR = 5.50 BRL
                System.out.println("Convertendo para Euro...");
            }
            case 3 -> {
                taxaDeCambio = 6.10; // Exemplo: 1 GBP = 6.10 BRL
                System.out.println("Convertendo para Libra...");
            }
            case 4 -> {
                taxaDeCambio = 0.038; // Exemplo: 1 JPY = 0.038 BRL
                System.out.println("Convertendo para Iene...");
            }
            default -> {
                System.out.println("Opção inválida!");
                System.exit(0);
            }
        }

        double valorConvertido = valorEmReais / taxaDeCambio;
        System.out.printf("Valor convertido: %.2f%n", valorConvertido);
    }
}
