public class Main {
    public static void main(String[] args) {

        Pessoa fabio = new Pessoa();
        fabio.setNome("Fabio");

        Conta cc = new ContaCorrente(fabio);
        Conta poupanca = new ContaPoupanca(fabio);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marcia");

        cc.depositar(100);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        //funcionario.imprimirFuncionarios();



    }
}
