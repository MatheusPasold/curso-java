package br.com.cursojava;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		String s = teclado.nextLine();
		double salario = Double.parseDouble(s);
		
		System.out.println("Salário: " + salario);
		System.out.println("Taxa de imposto: ");
		if(salario <= 1800) {
			System.out.println("Isento");
		}else if(salario < 2400.00) {
			System.out.println("7,5 %");
			System.out.println("Valor descontado da conta: " + (salario*0.075));
			System.out.println("Salário com impostos: " + (salario-(salario*0.075)));
		}else if(salario < 3600.00) {
			System.out.println("15 %");
			System.out.println("Valor descontado da conta: " + (salario*0.15));
			System.out.println("Salário com impostos: " + (salario-(salario*0.15)));
		}else if(salario > 3600.00) {
			System.out.println("27 %");
			System.out.println("Valor descontado da conta: " + (salario*0.27));
			System.out.println("Salário com impostos: " + (salario-(salario*0.27)));
			
		}
		
		teclado.close();
}
}