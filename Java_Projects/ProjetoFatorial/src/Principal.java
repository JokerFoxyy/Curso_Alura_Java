
public class Principal {

	public static void main(String[] args) {

		int numero = 0, fatorial = 1;

		for (int i = numero - 1; i >= 1; i--) {
			fatorial += fatorial * i;
		}

		if (numero == 1 || numero == 0) {
			System.out.println("O fatorial de " + numero + " ?: 1");
		} else {
			System.out.println("O fatorial de " + numero + " ?: " + fatorial);
		}

	}

}
