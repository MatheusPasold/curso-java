package br.com.cursohava;

import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Professora");
			System.out.println("3 - Cadastrar Turma");
			System.out.println("4 - Sair");
			n = Integer.parseInt(teclado.nextLine());
			switch (n) {
			case 1:
				System.out.println("Voc� escolheu Cadastrar Aluno");
				break;
			case 2:
				System.out.println("Voc� escolheu Cadastrar Professora");
				break;
			case 3:
				System.out.println("Voc� escolheu Cadastrar Turma");
				break;
			case 4:
				System.out.println("Fim da aplica��o");
				break;
			default:
				System.out.println("Inv�lido");
			}
		}while (n != 4);	
		teclado.close();
	}
}