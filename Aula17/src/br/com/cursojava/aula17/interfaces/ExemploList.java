package br.com.cursojava.aula17.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Jo�o");
		nomes.add("Maria");
		nomes.add("Ad�o");
		nomes.add("Eva");
		
		System.out.println(nomes);
		Collections.sort(nomes);
		System.out.println(nomes);
		Collections.sort(nomes,Collections.reverseOrder());
		System.out.println(nomes);
		
		List<Contato> contatos = new ArrayList<>();
		contatos.add(new Contato("Jo�o da Nica", "joao@gmail.com"));
		contatos.add(new Contato("Maria", "maria@gmail.com"));
		contatos.add(new Contato("Ad�o", "adao@gmail.com"));
		contatos.add(new Contato("Eva", "eva@gmail.com"));
		contatos.add(new Contato("Eva","eva2@gmail.com"));
		contatos.add(new Contato("Z� Bostola", "zebosta@gmail.com"));
		
		System.out.println(contatos);
		Collections.sort(contatos);
		System.out.println(contatos);
}
}
