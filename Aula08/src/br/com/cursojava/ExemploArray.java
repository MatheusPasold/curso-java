package br.com.cursojava;

public class ExemploArray {
	
	public static void main(String[] args) {
		
		int[] numeros;
		String nomes[];
		numeros = new int[10];
		nomes = new String[3];
		
		String[] frutas = {"ABACAXI", "BANANA", "PÊSSEGO"};
		double[] medias = new double[3];
		int[] notas = new int[]{10,9,8,10,9,8};
		int[] notas2 = {10,9,8,10,9,8};
		notas = new int[] {100};
		int y = new int[] {10,9,8,7}[1];
		notas = new int [] {10,10,10,10};
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		System.out.println(y);
		
		System.out.println(medias.length);
		System.out.println(notas.length);
		
		for(int atual: notas) {
			System.out.print(atual + " ");
		}
		
		for(int i=0; i < notas.length; i++) {
			int atual = notas[i];
			System.out.println(atual + " ");
		}
	}
}