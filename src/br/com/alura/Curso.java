package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	/* É recomendado que usemos a interface ao invés da classe concreta para
	 * termos um pouco mais de versatilidade, podendo mudar a implantação caso necessário.
	 * Ex: Dependendo da necessidade eu poderia tratar a lista aulas como um ArrayList ou LinkedList
	 */
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return aulas;
	}
}
