package br.com.cursojava;

import java.util.Scanner;

//Matheus Felipe Pasold: Avaliação Questão 3;
public class Exer3 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		String a = "a";
			
		for (int pos = 0; pos < frase.length(); pos++) {
			char v = frase.charAt(pos);
			String vogal = Character.toString(v);
			
			if(vogal.equals(a) == true) {
				System.out.print(frase.charAt(pos+1));
			}
			
		}
		teclado.close();
	}

}
