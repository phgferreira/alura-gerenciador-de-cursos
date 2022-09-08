package br.com.alura;

public class Aluno {

	private String nome;
	private Integer numeroMatricula;

	public Aluno(String nome, Integer numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

}
