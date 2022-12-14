package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAluno {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sérgio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		/* 1ª regra de usar um Set ou uma Collections é que não
		 * tem garantia de que a ordem continuará da mesma forma
		 * que foi inserida
		 */
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		// Forma alternativa de imprimir os objetos de um Set é usando o método forEach com lambda
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		// Mesmo que tenha inserido um objeto repetido ele não duplica esse objeto na coleção
		alunos.add("Mauricio Aniche");
		System.out.println(alunos.size());
		
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
	}

}
