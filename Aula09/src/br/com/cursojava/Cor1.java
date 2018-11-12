package br.com.cursojava;

import java.util.Scanner;

public class Cor1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[][] turma = new double[3][3];
		double[] medias = new double[turma.length];
		double mediaGeral = 0;

		for (int aluno = 0; aluno < turma.length; aluno++) {
			for (int nota = 0; nota < turma[aluno].length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d\n", nota + 1, aluno + 1);
				turma[aluno][nota] = Double.parseDouble(teclado.nextLine());
				medias[aluno] += turma[aluno][nota];
				mediaGeral += turma[aluno][nota];
			}
			medias[aluno] /= turma[aluno].length;
		}
		mediaGeral /= turma.length * turma[0].length;

		for (int aluno = 0; aluno < turma.length; aluno++) {
			System.out.printf("As notas do aluno %d foram:\n", aluno + 1);
			for (int nota = 0; nota < turma[aluno].length; nota++) {
				System.out.printf("%.2f ", turma[aluno][nota]);
			}
			System.out.println("Sua média foi :"+medias[aluno]);
		}
		System.out.println("Média geral da turma: "+mediaGeral);
		teclado.close();
	}
}