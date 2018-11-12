package br.com.cursohava;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		float n1 = Integer.parseInt(teclado.nextLine());
		while (n1 >= 0) {
			System.out.println("Digite a segunda nota");
			float n2 = Integer.parseInt(teclado.nextLine());
			System.out.println("Digite a terceira nota");
			float n3 = Integer.parseInt(teclado.nextLine());
			
			float media = (n1 + n2 + n3) / 3; System.out.println(media);
			System.out.println("Média: " + media);
			
			System.out.println("Digite a primeira nota");
			n1 = Integer.parseInt(teclado.nextLine());
		
		}
		System.out.println("Fim da aplicação");
		teclado.close();
	}
}
