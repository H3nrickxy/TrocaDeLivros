import java.util.Scanner;

public class ValorTotalComIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        System.out.println("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.println("Digite a quantidade de peças 1: ");
        int quantidadePeca1 = scanner.nextInt();

        System.out.println("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.println("Digite a quantidade de peças 2: ");
        int quantidadePeca2 = scanner.nextInt();

        double valorTotal = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2) * (ipi / 100 + 1);

        System.out.println("O valor total a ser pago é: " + valorTotal);
    }
}
