package br.com.cursojava.aula11;

public class Contato {

	//variáveis de instância/propriedades/atributos
	String nome;
	String email;
	String telefone;
	
	void configuraNome(String nome) {
		this.nome = nome; //serve para referência de uma variável de mesmo nome(Sonbreamento de variáveis)//this representa a variável de instância
	}
	String retornarNome() {
		return nome;
	}
	
	void configurarEmail(String email) {
		this.email = email;
	}
	String retornaEmail() {
		return email;
	}
	
	void configuraTelefone(String telefone) {
		this.telefone = telefone;
	}
	String retornaTelefone() {
		return telefone;
	}
	
	void ligar() {
		System.out.println("Ligando para o contato " + nome);
		System.out.println("Telefone: " + telefone);
	}
	
	void enviarMensagem(String mensagem) {
		System.out.println("Enviando a mensagem");
		System.out.println(mensagem);
		System.out.println("Para o email: " + email);
	}
}
