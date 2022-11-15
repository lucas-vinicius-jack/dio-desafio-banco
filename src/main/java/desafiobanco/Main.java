package desafiobanco;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lucas");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Jack");

		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente2);

		cc.depositar(100);

		cp.depositar(50);

		cc.transferir(25, cp);

		cc.imprimirExtrato();

		cp.imprimirExtrato();

	}

}
