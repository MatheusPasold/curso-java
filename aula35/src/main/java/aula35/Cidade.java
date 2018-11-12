package aula35;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cidades")
public class Cidade {

	@Column
	private String nome;
	
	private Estado estado;

	private Integer populacao;

	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cidade(String nome, Estado estado, Integer populacao) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.populacao = populacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", estado=" + estado + ", populacao=" + populacao + "]";
	}
	
	

}
