package byteBank;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean Saca(double valor) {
		double novoValor = valor + 1;
		return super.Saca(novoValor);
	}

}
