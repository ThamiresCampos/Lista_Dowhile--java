package Dowhile_java;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int contadora = 15;	
		double resultado = 0; 


		
		
		do {
		resultado = Math.pow(contadora, 2); 
		System.out.println(contadora + " ^2    = " + resultado);
		contadora++;
		}while(contadora <= 200);

	}
	
}
