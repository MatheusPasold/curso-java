package br.com.cursojava.aula15.trabalho;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroCliente cadastro = new CadastroCliente();
		cadastro.menu(teclado);
		teclado.close();
	}

}
