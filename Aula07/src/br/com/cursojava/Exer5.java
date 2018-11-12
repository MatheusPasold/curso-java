package br.com.cursojava;

import java.util.Scanner;

public class Exer5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("ESCREVA UMA FRASE: ");
		String frase = teclado.nextLine();
		
		for (int pos = 0; pos < frase.length(); pos++) {
			if(pos % 2 != 0) {
				System.out.print(frase.charAt(pos));
			}
		}
		
		teclado.close();
	}
}