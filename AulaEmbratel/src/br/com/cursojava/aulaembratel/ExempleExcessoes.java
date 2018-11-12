package br.com.cursojava.aulaembratel;

import java.util.Scanner;

public class ExempleExcessoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*System.out.println("Digite um n�mero: ");
		int numero = Integer.parseInt(teclado.nextLine());
		System.out.println("O n�mero digitado foi: " + numero);
		*/
		
		try {
			String[] nomes = {"Jo�o","Maria"};
			System.out.println(Integer.parseInt("dois"));
			System.out.println(nomes[2]);
			
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException ex) { //Throwable
			System.out.println(ex.getClass());
			System.out.println("Voc� tentou acessar uma posi��o inv�lida ou a convers�o n�o funcionou!");
		}
		teclado.close();
	}
}
