package Dowhile_java;

public class Exercicio07 {

	public static void main(String[] args) {

		int fatorial = 0;
		int contadora = 0;

		do {

			if (contadora % 2 == 1) {
				fatorial = contadora * (contadora - 1);
				contadora++;
			}

		} while (contadora <= 10);
		System.out.println("O fatorial dos números ímpares na faixa entre 1 a 10: " + fatorial);

	}

}
