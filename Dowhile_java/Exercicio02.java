package Dowhile_java;

public class Exercicio02 {

	public static void main(String[] args) {
	
		int contadora = 1;	
		int soma = 0; 


		
		
		do {
		if (contadora % 2 == 0) {
		soma = soma + contadora;
	}
		contadora++;

		}while(contadora <= 500);
		System.out.println("A somatória dos números pares existentes na faixa de 1 a 500 é  : " +soma);

	}

}
