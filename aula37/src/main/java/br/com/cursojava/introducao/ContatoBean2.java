package br.com.cursojava.introducao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ContatoBean2{

	private String nome;
	private String email;
	private String telefone;
	private List<Contato> contatos = new ArrayList<>();

	public List<Contato> getContatos() {
		return contatos;
	}


	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}


	public ContatoBean2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContatoBean2(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

	public void salvar() {
		Contato contato = new Contato(nome, email, telefone);
		contatos.add(contato);
		limparCampos();
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage("Contato adicionado com sucesso");
		mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
		context.addMessage("nome", mensagem);
	}

	private void limparCampos() {
		this.nome = "";
		this.email = "";
		this.telefone = "";
	}
}
