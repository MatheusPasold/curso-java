package br.com.cursojava.aula14;

import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> listaNomes = new ArrayList<>();
		
		int  quantidadeInicial = listaNomes.size();
		System.out.println(quantidadeInicial);
		
		listaNomes.add("João");//adiciona ao final da lista
		System.out.println(listaNomes.size());
		
		listaNomes.add("Maria"); //adiciona ao final da lista
		System.out.println(listaNomes.size());
		System.out.println(listaNomes);
		
		listaNomes.add(0, "Adão");//adiciona em um indice
		System.out.println(listaNomes);
		listaNomes.add(1, "Eva");//adiciona em um indice
		System.out.println(listaNomes);
		
		listaNomes.add(1, "Eva Maria da Silva");//altera o elemento na lista
		System.out.println(listaNomes);
		
		System.out.println(listaNomes.get(2));//Busca um elemento da lista de acordo com o indice
		
		System.out.println(listaNomes.remove(1));
		System.out.println(listaNomes);
		System.out.println(listaNomes.remove("João"));
		System.out.println(listaNomes);
		
		System.out.println(listaNomes.indexOf("Eva"));
	}
}
