package byteBank;

public class Conta {

	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private double saldo;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		Conta.total++;
		System.out.println("Estou criando uma conta...");
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	public void Deposita(Double valor) {
		this.saldo += valor;

		System.out.println("O seu saldo atual é: " + this.saldo);
	}

	public boolean Saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean Transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.Saca(valor);
			contaDestino.Deposita(valor);
			return false;
		}
		return true;
	}
}
