package br.com.cursojava.aulaembratel;

import java.util.Scanner;

public class ExempleExcessoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*System.out.println("Digite um número: ");
		int numero = Integer.parseInt(teclado.nextLine());
		System.out.println("O número digitado foi: " + numero);
		*/
		
		try {
			String[] nomes = {"João","Maria"};
			System.out.println(Integer.parseInt("dois"));
			System.out.println(nomes[2]);
			
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException ex) { //Throwable
			System.out.println(ex.getClass());
			System.out.println("Você tentou acessar uma posição inválida ou a conversão não funcionou!");
		}
		teclado.close();
	}
}
