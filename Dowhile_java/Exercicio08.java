package Dowhile_java;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float area = 0;
		float total = 0;
		String parar = "s";
		int contadora = 0;

		do {
			System.out.println("Insira o nome do cômodo: ");
			String nome = sc.next();
			System.out.println();

			System.out.println("Dígite a largura do cômodo: ");
			float largura = sc.nextFloat();
			System.out.println();

			System.out.println("Dígite o comprimento do cômodo: ");
			float comprimento = sc.nextFloat();
			System.out.println();

			area = largura * comprimento;

			total = area + total;

			System.out.println("Deseja continuar calculando? [s/n]: ");
			parar = sc.next();
			System.out.println();

			System.out.println("Os cômodos inseridos foram : " + nome);
			System.out.println();

			contadora++;

		} while (parar == "s");
		System.out.println("O valor da área calculada da residência é de: " + area);
		
		sc.close();
	}
	
}
