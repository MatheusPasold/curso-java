package br.com.cursojava;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		String n = teclado.nextLine();
		int numero = Integer.parseInt(n);
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero � PAR");
		}else {
			System.out.println("O n�mero � IMPAR");
		}

		teclado.close();
}
}