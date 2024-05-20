import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Numero da Conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o Numero da Agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o Nome do Cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite o Saldo Bancario:");
        double saldo = scanner.nextDouble();

        String concatena = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia;

        System.out.println(concatena + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
