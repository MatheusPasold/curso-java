package br.com.cursojava;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Seu nome tem " + nome.length() + " letras");
		
		
		teclado.close();
	}
}
