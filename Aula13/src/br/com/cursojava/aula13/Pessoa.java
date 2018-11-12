package br.com.cursojava.aula13;

public class Pessoa {

	private String nome;
	private String codigo;
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome,String codigo) {
		this();
		setNome(nome);
		setCodigo(codigo);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
