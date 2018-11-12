package br.com.cursohava;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n = 0;
		while (n != 4) {
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Professora");
			System.out.println("3 - Cadastrar Turma");
			System.out.println("4 - Sair");
			n = Integer.parseInt(teclado.nextLine());
			switch (n) {
			case 1:
				System.out.println("Você escolheu Cadastrar Aluno");
				break;
			case 2:
				System.out.println("Você escolheu Cadastrar Professora");
				break;
			case 3:
				System.out.println("Você escolheu Cadastrar Turma");
				break;
			case 4:
				System.out.println("Fim da aplicação");
				break;
			default:
				System.out.println("Inválido");
			}

		}
		teclado.close();
	}

}