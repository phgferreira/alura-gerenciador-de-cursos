package br.com.alura;

public class TestaBuscaAlunosNoCurso {

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
		
		System.out.println("Quem é o aluno com matrícula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(561777);
		System.out.println("Aluno: " + aluno);
	}

}
