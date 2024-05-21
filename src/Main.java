
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Jony Melo");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(150, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
