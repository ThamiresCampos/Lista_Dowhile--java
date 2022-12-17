package Dowhile_java;

public class Exercicio05 {

	public static void main(String[] args) {
		int contadora = 1; 
		int fatorial =  0; 
		int soma =  0; 


		do {
		
		fatorial = contadora * (contadora - 1);
		soma = soma + fatorial;
		contadora++;

		}while(contadora <= 15);
		System.out.println("A soma dos números fatorados é : " + soma);
	}

}
