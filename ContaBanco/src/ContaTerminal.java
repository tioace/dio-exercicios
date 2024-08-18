import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.print("Digite o seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Digite o numero da agencia: ");
        agencia = leitor.nextLine();
        System.out.print("Digite o numero da conta: ");
        numero = leitor.nextInt();
        System.out.print("Digite o seu saldo: ");
        saldo = leitor.nextDouble();


        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, numero, saldo));

        leitor.close();
    }
}
