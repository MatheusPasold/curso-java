package br.com.cursojava;

import java.util.Scanner;

public class Exer1 {
	
	public static void main(String[] args) {
		
		long fatorial = 1;
		int numero = 0;
		Scanner teclado = new Scanner(System.in);
		
		do {	
			numero = Integer.parseInt(teclado.nextLine());
		}while(numero < 1 || numero > 20);
		
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		teclado.close();
	}

}
