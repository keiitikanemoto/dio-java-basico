import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int agencia = sc.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Digite o nome de usuário: ");
        String nome = sc.next();

        double saldo = 237.48;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo R$ %.2f já esdtá disponível para saque.", nome, agencia, conta, saldo);

    }
}
