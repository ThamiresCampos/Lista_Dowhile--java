package Dowhile_java;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dividendo = 0;
		int divisor = 0;
		int numero = 0;
		int maior = 0;

		do {
			System.out.println("Insira o dividendo: ");
			dividendo = sc.nextInt();
			System.out.println();

			System.out.println("Insira o divisor: ");
			divisor = sc.nextInt();
			System.out.println();

			numero = numero + 1;
			dividendo = dividendo - divisor;

		} while (dividendo > divisor);
		System.out.println(maior + " O resultado é :" + numero);
		sc.close();
	}

}
