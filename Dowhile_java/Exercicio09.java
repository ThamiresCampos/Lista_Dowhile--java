package Dowhile_java;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		
		
		int maior=0;
		int menor=0;
		int numero=0;
		
		do {
		    System.out.println("Digite um numero: ");
		    int usuario = sc.nextInt();
		    numero = usuario;
		    if (numero > maior) {
		         maior = numero;
		    }
		    else {
		        menor = numero;
		    }
		    
		    
		}
			
		while (numero >= 0); {
			System.out.println("O maior número digitado " + maior);
			System.out.println("O menor número digitado " + menor);
		}
		sc.close();
	}
	}
