import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int saldo = 1999;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Olá, digite seu nome: " );
        String nome = entrada.next();
        System.out.print("Agora digite sua conta: ");
        int conta = entrada.nextInt();
        System.out.print("Digite sua Agencia: ");
        String agencia = entrada.next();
        System.out.print("Seu saldo é: " + saldo);




        entrada.close();


    }
}
