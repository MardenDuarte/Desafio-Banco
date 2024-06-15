
public class Main {
    public static void main(String[] args) {
        Cliente marden = new Cliente();
        marden.setNome("Marden");

        Conta cc = new ContaCorrente(marden);
        Conta poupanca = new ContaPoupanca(marden);

        cc.depositar(100);
        cc.transferir(50, poupanca);
        cc.imprimirExtrato();

        poupanca.depositar(100);
        poupanca.transferir(50, cc);
        poupanca.imprimirExtrato();
    }
}