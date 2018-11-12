package br.com.cursojava.aula13;

public class Contato extends Pessoa{
	
	private Integer id;
	private String email;
	private String telefone;
	
	public Contato(Integer id, String nome, String codigo, String email, String telefone) {
		super(nome, codigo);
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}