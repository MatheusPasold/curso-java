package br.com.cursojava;

import java.util.Scanner;

public class Exer3 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float[] notas = new float[5];
		int maior = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d� nota: ", i+1);
			notas[i] = Float.parseFloat(teclado.nextLine());
			if(notas[i] > notas[maior]) {
				maior = i;
			}
			
		}
		System.out.println("A maior nota � " + notas[maior]);
		System.out.println("Est� na posi��o " + maior);
		
		
		teclado.close();
	}

}
