package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArraysLists", 21);
		Aula a2 = new Aula("Listas de Objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
	}
}
