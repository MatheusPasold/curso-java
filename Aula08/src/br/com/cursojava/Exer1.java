package br.com.cursojava;

import java.util.Scanner;

public class Exer1 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float[] notas = new float[10];
		float soma = 0;
		for (int pos = 0; pos < 10; pos++) {
			System.out.println(" Digite a nota ");
			float num = Float.parseFloat(teclado.nextLine());
			notas[pos] = num;
			soma += num;
		}		
		float media = soma / 10;
		
		System.out.println("As notas digitadas foram ");
		for (float atual: notas) {
			System.out.print(atual + ", ");
		}
		
		System.out.println("A média é " + media);
		teclado.close();
	}

}
