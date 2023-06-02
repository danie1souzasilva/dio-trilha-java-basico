public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 50;
        double valorSaque = 38;

        if(saldo > valorSaque){
            saldo = saldo - valorSaque;
            System.out.println(saldo);
        };
    }
    
}
