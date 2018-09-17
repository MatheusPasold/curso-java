package br.com.cursojava;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		String i = teclado.nextLine();
		int idade = Integer.parseInt(i);
		System.out.println("Digite seu peso: ");
		String p = teclado.nextLine();
		double peso = Double.parseDouble(p);
		System.out.println("Digite sua altura: ");
		String a = teclado.nextLine();
		double altura = Double.parseDouble(a);
		
		double imc = peso / (altura*altura);
		
		System.out.println("Sua idade é " + idade);
		System.out.println("Seu IMC é " + imc);
		if(imc < 17) {
			System.out.print("Muito abaixo do peso");
		}else if(imc < 18.5) {
			System.out.print("Abaixo do peso");
		}else if(imc < 25) {
			System.out.print(" Peso Normal");
		}else if(imc < 30) {
			System.out.print("Acima do Peso");
		}else if(imc < 35) {
			System.out.print("Obesidade I ");
		}else if(imc < 40) {
			System.out.print("Obesidade II (severa) ");
		}else if(imc > 40) {
			System.out.print("Obesidade III (mórbida) ");
		}

		teclado.close();
}
}