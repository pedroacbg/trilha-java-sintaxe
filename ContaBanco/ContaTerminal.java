import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao banco BagreBank!");
        System.out.print("Por favor, digite seu Nome: ");
        String nome = sc.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }

}
