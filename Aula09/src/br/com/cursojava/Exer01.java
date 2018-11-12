package br.com.cursojava;

import java.util.Arrays;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[][] notas = new double[10][3];
		double[] medias = new double[10];
		float mediaT = 0;
		float soma = 0;
		System.out.println("SOCORRO!!!!!!!!!!!!!!");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Aluno" + i+1);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Digite a %dª nota ", j + 1);
				notas[i][j] = Double.parseDouble(teclado.nextLine());
				soma += notas[i][j];
				medias[i] += notas[i][j];
			}
			medias[i] /= notas[i].length;
		}
		mediaT = soma / 30;
		
		System.out.println("A média geral foi " + mediaT);
		
		for(int i = 0; i < medias.length; i++) {
			System.out.printf("A média do aluno %d foi ", i);
			System.out.println(medias[i]);
		}
		
		teclado.close();
	}
}