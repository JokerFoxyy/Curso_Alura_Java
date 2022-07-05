package byteBank;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.Deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.Deposita(100.0);

		cc.Saca(150);

		System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());

	}

}
