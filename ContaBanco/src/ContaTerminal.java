import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner leituraValores = new Scanner(System.in);

        System.out.printf("Por favor, digite o número da conta: ");
        int Numero = Integer.parseInt(leituraValores.nextLine());

        System.out.printf("Por favor, digite o número da agência: ");
        String Agencia = leituraValores.nextLine();

        System.out.printf("Por favor, digite o nome do cliente: ");
        String NomeCliente = leituraValores.nextLine();

        System.out.printf("Por favor, digite o saldo: ");
        double Saldo = Double.parseDouble(leituraValores.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                NomeCliente, Agencia, Numero, Saldo);
    }
}