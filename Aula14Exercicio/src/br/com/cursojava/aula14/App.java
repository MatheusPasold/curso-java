package br.com.cursojava.aula14;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroVeiculo cadastro = new CadastroVeiculo();
		cadastro.menu(teclado);
		teclado.close();
	}
}
