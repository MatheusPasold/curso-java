package br.com.cursojava;

import java.util.Scanner;

public class Exer3 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int maior = 0;
		System.out.println("ESCREVA O PRIMEIRO N�MERO");
		int numero = Integer.parseInt(teclado.nextLine());
		maior = numero;
		
		for(int pos = 1; pos < 5; pos++) {
			System.out.println("ESCREVA O PR�XIMO N�MERO");
			numero = Integer.parseInt(teclado.nextLine());
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("O maior n�mero � " + maior);
		
		teclado.close();
	}

}
