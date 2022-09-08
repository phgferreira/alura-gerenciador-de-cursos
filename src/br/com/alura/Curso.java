package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	/* É recomendado que usemos a interface ao invés da classe concreta para
	 * termos um pouco mais de versatilidade, podendo mudar a implantação caso necessário.
	 * Ex: Dependendo da necessidade eu poderia tratar a lista aulas como um ArrayList ou LinkedList
	 */
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public Integer getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", tempo total=" + getTempoTotal() + ", aulas=" + aulas +"]";
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
}
