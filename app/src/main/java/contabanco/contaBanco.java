
package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class contaBanco{
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Agora digite a agência do banco.");
        double agencia = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite quanto você quer por de saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome+" !"+" obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é "+agencia+" e banco "+numero+", seu saldo ");
        System.out.println("é de "+saldo+" já está disponível para saque.");

    }
}
