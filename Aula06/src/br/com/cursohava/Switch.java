package br.com.cursohava;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero entre 1 e 7");
		int dia = Integer.parseInt(teclado.nextLine());
		switch(dia) {
		case 1: 
			System.out.println("Domingo");
		case 2: 
			System.out.println("Segunda");	
		case 3: 
			System.out.println("Ter�a");
		case 4: 
			System.out.println("Quarta");
		case 5: 
			System.out.println("Quinta");
		case 6: 
			System.out.println("Sexta EIAEIAEIA");
		case 7: 
			System.out.println("S�bado");	
		default:
			System.out.println("N�mero Invalido");
		}
		
		teclado.close();
	}

}
