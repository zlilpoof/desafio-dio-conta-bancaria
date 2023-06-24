import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int Numero; String Agencia; String NomeCliente; float Saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        Numero = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        Agencia = teclado.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        NomeCliente = teclado.nextLine();


        System.out.print("Por favor, digite o saldo: ");
        Saldo = teclado.nextFloat();

        System.out.println("Olá " + NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+ Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
