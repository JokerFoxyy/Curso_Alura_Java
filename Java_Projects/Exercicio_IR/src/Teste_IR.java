public class Teste_IR {

	public static void main(String[] args) {

		/*
		 * De 1900.0 at? 2800.0, o IR ? de 7.5% e pode deduzir na declara??o o valor de
		 * R$ 142 De 2800.01 at? 3751.0, o IR ? de 15% e pode deduzir R$ 350 De 3751.01
		 * at? 4664.00, o IR ? de 22.5% e pode deduzir R$ 636
		 */

		double salarioBruto = 5500.0, salarioLiquido = 3300.0;

		if (salarioBruto >= 1900 && salarioBruto <= 2800) {
			salarioLiquido = salarioBruto - 142;
			System.out.println("A sua aliquota ? de 7,5%");
			System.out.println("Voc? pode deduzir at? R$ 142");
		} else if (salarioBruto > 2800 && salarioBruto <= 3751) {
			salarioLiquido = salarioBruto - 350;
			System.out.println("A usa aliquota ? de 15%");
			System.out.println("Voc? pode deduzir at? R$ 350");

		} else if (salarioBruto < 4664) {
			salarioLiquido = salarioBruto - 636;
			System.out.println("A usa aliquota ? de 22,5%");
			System.out.println("Voc? pode deduzir at? R$ 636");
		} else {
			salarioLiquido = salarioBruto - 869.36;
			System.out.println("A usa aliquota ? de 27,5%");
			System.out.println("Voc? pode deduzir at? R$ 869,36");
		}

		System.out.println("Seu sal?rio ficou:" + salarioLiquido);

	}
}
