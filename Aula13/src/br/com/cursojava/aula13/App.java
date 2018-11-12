package br.com.cursojava.aula13;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CadastroContato cadastro = new CadastroContato();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}

}