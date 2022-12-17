package Dowhile_java;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int contadora = 0; 
		int soma =  0; 
		int totalNumeros =  0; 
		int media =  0;


		
		
		do {
		
		System.out.println("Dígite um número");
		int numero = sc.nextInt();
		System.out.println();
		contadora++;

		soma =  soma + numero;
		totalNumeros =  totalNumeros + 1; 
		media =  soma / totalNumeros;

		System.out.println("A quantidade de números digitados  foram : " + contadora);
		System.out.println("A média dos números é : " + media);
		System.out.println("A soma dos valores lidos foi de : " + soma);



		}while(contadora >= 0);

		sc.close();
		
	}

}
