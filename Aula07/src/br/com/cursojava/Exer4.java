package br.com.cursojava;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		int soma = 0;
		float media = 0;	
		Scanner teclado = new Scanner(System.in);
		System.out.println("ESCREVA O PRIMEIRA NOTA");
		int numero = Integer.parseInt(teclado.nextLine());
		
		soma += numero;
		
		for(int pos = 1; pos < 5; pos++) {
			System.out.println("ESCREVA O PR�XIMA NOTA");
			numero = Integer.parseInt(teclado.nextLine());
			soma += numero;
		}
		
		media = soma / 5;
		
		System.out.println("A soma dos n�meros �: " + soma);
		System.out.println("A m�dia dos n�meros �: " + media);
		
		teclado.close();
	}
}