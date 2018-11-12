package br.com.cursojava.aula11;

public class Contato {

	//vari�veis de inst�ncia/propriedades/atributos
	String nome;
	String email;
	String telefone;
	
	void configuraNome(String nome) {
		this.nome = nome; //serve para refer�ncia de uma vari�vel de mesmo nome(Sonbreamento de vari�veis)//this representa a vari�vel de inst�ncia
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
