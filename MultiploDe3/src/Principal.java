
public class Principal {

	public static void main(String[] args) {

		int auxiliar = 0;
		int number = 4;
		System.out.println("Os m�ltiplos s�o:");
		for (int i = 1; i <= 100; i++) {

			if (i % number == 0) {
				System.out.println(i);
				System.out.println();
				auxiliar++;
			}

		}

		System.out.println("O " + number + " tem " + auxiliar + " m�ltiplos entre 1 e 100!!");

	}

}
