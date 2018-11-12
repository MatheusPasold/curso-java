package br.com.cursojava;

import java.util.Scanner;

public class Exer4 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[3];
		for(int i = 0; i < nomes.length; i++ ) {
			System.out.printf("Informe o %dº nome: ", i+1);
			nomes[i] = teclado.nextLine();
		}
		System.out.println(" A ordem inversa da lista é");
		for(int i = nomes.length - 1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
		
		teclado.close();
	}

}
