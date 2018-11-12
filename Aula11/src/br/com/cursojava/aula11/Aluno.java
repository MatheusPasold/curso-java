package br.com.cursojava.aula11;

public class Aluno {
	
	String ano;
	String telefone;
	String matricula;
	
	void configuraAno(String ano) {
		this.ano = ano;
	}
	String retornaAno() {
		return ano;
	}
	
	void configuraTelefone(String telefone) {
		this.telefone = telefone;
	}
	String retornaTelefone() {
		return telefone;
	}
	
	void configuraMatricula(String matricula) {
		this.matricula = matricula;
	}
	String retornaMatricula() {
		return matricula;
	}
}
