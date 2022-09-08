# alura-gerenciador-de-cursos

> Status: Em desenvolvimento

Esse projeto tem o objetivo de por em prática tudo que for aprendito no curso da Alura [Java Collections: Dominando Listas, Sets e Mapas](https://www.alura.com.br/curso-online-java-collections)

### Aula 01
Revisando matéria:
* Adicionando e removendo itens em um ArrayList;
* Percorrendo a lista com foreach;
* Buscando o primeiro elemento;
* Percorrendo a lisat com índice;
* Percorrendo com o método forEach e lambda;
* Ordenando lista com Collections.

### Aula 02
* Criando uma nova lista de objetos Aula e adicionando em uma lista;
* Ordenando a lista implantando um critério de ordenação na classe Aula usando Comparable e compareTo();
* Ordenando com outro critério de ordenação usando Comparator.comparing.

### Aula 03
* Criando a classe curso;
* Adicionando aulas da forma não recomendada, usando o javaColecoes.getAulas().add (new Aula ...) e encapsuando isso criando o método adicionar na classe Curso;
* Usando o Collections.unmodifiedList no return do método getAulas para impedir que peguem essa lista e modifiquem externamente ao objeto Curso;
* Demonstrando um pouco a versatilidade de quando usamos a interface List ao invés de ArrayList e LinkedList como atributos do objeto.

### Aula 04
* Ordenando as aulas do curso;
* Exibindo o tempo total das aulas;
* Outros métodos de Collections:
    * reverse();
    * shuffle();
    * singletonList();
    * nCopies().

### Aula 05
* Conhecendo o Set e Collections;
* Analisando suas diferenças com uma lista;
* Verificando performance do HashSet com uma ArrayList.

### Aula 06
* Criand oa classe aluno e encapsulando com o método matricula(Aluno aluno);
* Protegendo modificação da coleção de alunos com **Collections.unmodifiableSet(...)**;
* Conhecedo o **Collections.emptySet()**;
* Conhecendo o **Collections.synchronizedSet(...)**.
