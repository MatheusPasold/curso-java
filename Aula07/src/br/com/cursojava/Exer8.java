package br.com.cursojava;

public class Exer8 {

	public static void main(String[] args) {

		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}