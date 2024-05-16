import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int conta;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Por favor digite o número da conta: ");
        conta = reader.nextInt();
        reader.nextLine();

        System.out.println("Por favor digite o número da agência: ");
        agencia = reader.nextLine();

        System.out.println("Por favor digite o seu nome: ");
        nomeDoCliente = reader.nextLine();

        System.out.println("Por favor digite o número do seu saldo: ");
        saldo = reader.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo é de R$" + saldo + ", já disponível para saque.");
        reader.close();
    }
}
