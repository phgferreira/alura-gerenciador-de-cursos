package br.com.alura;

import java.util.Iterator;
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
		
//		Set<String> nomes = Collections.emptySet();
//		nomes.add("Ferreira");
		
		System.out.println("O aluno " + guilherme + " está matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(guilherme));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("O rodrigo é igual ao turini?");
		System.out.println(rodrigo.equals(turini));

		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		// ATENÇÃO: Toda vez que for redefinir o método equals, precisa redefinir o método hashCode
		
		System.out.println(rodrigo.hashCode() == turini.hashCode());
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		/*
		 * Usando um iterador, depois de já ter percorrido todos os itens, o método next não funciona mais,
		 * para repercorrer os itens precisar criar um novo itarador
		 */
		//Aluno depoisDoUltimo = iterator.next();
	}
}
