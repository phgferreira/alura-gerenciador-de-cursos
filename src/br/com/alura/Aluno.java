package br.com.alura;

public class Aluno {

	private String nome;
	private Integer numeroMatricula;

	public Aluno(String nome, Integer numeroMatricula) {
		if (nome == null)
			throw new NullPointerException("Nome não pode ser NULL");
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

}
