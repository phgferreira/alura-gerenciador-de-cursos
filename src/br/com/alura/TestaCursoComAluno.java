package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno rodrigo = new Aluno("Rodrigo Turini", 34672);
		Aluno guilherme = new Aluno("Guilherme Silveira", 5617);;
		Aluno mauricio = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(rodrigo);
		javaColecoes.matricula(guilherme);
		javaColecoes.matricula(mauricio);
		
		System.out.println("Todos os alunos matriculados são:");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		Set<String> nomes = Collections.emptySet();
		nomes.add("Ferreira");
		
	}
}
