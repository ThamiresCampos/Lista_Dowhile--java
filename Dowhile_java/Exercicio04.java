package Dowhile_java;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int contadora = 0; 
		int grao = 0; 
		int numero = 1; 

		
		do {
		contadora++;
		grao = (grao + grao) + numero;
		System.out.println("Pode se obter num tabulero de xadrez : " + grao + " graos");
		}while(contadora <= 64);
		
	}
	
}
