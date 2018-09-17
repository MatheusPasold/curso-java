package br.com.cursojava;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		String i = teclado.nextLine();
		int idade = Integer.parseInt(i);
		if(idade >= 18) {
			System.out.println("Você já pode fazer o CNH");
		}else {
			System.out.println("Você ainda não pode fazer o CNH");
			System.out.println("Faltam " + (18 - idade) + " anos para poder fazer o CNH");
		}
		teclado.close();
}
}