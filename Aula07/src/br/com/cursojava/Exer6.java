package br.com.cursojava;

import java.util.Scanner;

public class Exer6 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ESCREVA UMA PALAVRA: ");
		String frase = teclado.nextLine();
		
		for (int pos = frase.length() - 1; pos >= 0; pos--) {
			System.out.print(frase.charAt(pos));
		}
		
		teclado.close();
	}

}
