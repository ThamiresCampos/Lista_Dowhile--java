package Dowhile_java;

public class Exercicio03 {

	public static void main(String[] args) {

		int contadora = 0;

		do {
			if (contadora % 4 == 0) {
				System.out.println(contadora);

			}
			contadora++;

		} while (contadora <= 200);

	}

}
