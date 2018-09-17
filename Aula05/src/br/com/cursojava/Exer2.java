package br.com.cursojava;

import java.util.Scanner;

public class Exer2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		String n1 = teclado.nextLine();
		double nota1 = Double.parseDouble(n1);
		System.out.println("Digite a nota 2: ");
		String n2 = teclado.nextLine();
		double nota2 = Double.parseDouble(n2);
		System.out.println("Digite a nota 3: ");
		String n3 = teclado.nextLine();
		double nota3 = Double.parseDouble(n3);
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Média : " + media);
		if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado ");
		}
		
		
		teclado.close();
	}

}
