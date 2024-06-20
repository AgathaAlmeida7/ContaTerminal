import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            // Solicita e lê os dados da conta bancária
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();

            // Exibe as informações da conta bancária
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
            System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + df.format(saldo));
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
        } finally {
            scanner.close(); // Fechar o scanner ao finalizar a entrada de dados
        }
    }
}
