package br.com.cursojava.primefaces;

public class Jogo {

	private Integer id;
	private String nome;
	private String genero;
	private Integer anoLancamento;
	private Double nota;
	private Plataform plataforma;
	
	
	public Plataform getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataform plataforma) {
		this.plataforma = plataforma;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Jogo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jogo(Integer id, String jogo, String genero, Integer anoLancamento, Double nota, Plataform plataforma) {
		super();
		this.id = id;
		this.nome = jogo;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.nota = nota;
		this.plataforma = plataforma;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoLancamento == null) ? 0 : anoLancamento.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		if (anoLancamento == null) {
			if (other.anoLancamento != null)
				return false;
		} else if (!anoLancamento.equals(other.anoLancamento))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Jogo [id=" + id + ", jogo=" + nome + ", genero=" + genero + ", anoLancamento=" + anoLancamento
				+ ", nota=" + nota + ", plataforma=\" + plataforma + \"]";
	}
	
	
	
}
