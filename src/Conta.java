
public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	protected void depositar(double valor) {
		saldo += valor;
	}
	protected void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}
	protected void transferir(double valor, Conta contaDestino) {
		if(saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		
	}
	
	protected void imprimirExtrato() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
