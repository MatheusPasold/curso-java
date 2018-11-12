package br.com.cursojava.aula11;

public class App {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.nome = "João";
		contato.email = "joao@teste.com";
		contato.telefone = "33221100";
		
		System.out.println(contato.nome);
		System.out.println(contato.email);
		System.out.println(contato.telefone);
		
		contato.configuraNome("João da Silva");
		System.out.println(contato.retornarNome());
		System.out.println(contato.nome);
		
		contato.ligar();
	}
}
