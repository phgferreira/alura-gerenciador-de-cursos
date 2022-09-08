package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		/*Crie a classe TestaPerformance, com um método main e um código que insere
		 * 50 mil números em uma ArrayList e os pesquisa. Vamos usar o método 
		 * currentTimeMillis(), de System, para cronometrar o tempo gasto com a adição
		 * e pesquisa dos elementos:
		 */
		
		Collection<Integer> numeros = new HashSet<>();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i <= 50000; i++) {
			numeros.add(i);
		}
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		long fim = System.currentTimeMillis();
		long tempoTotal = fim - inicio;
		System.out.println("Tempo total gasto pelo processo: " + tempoTotal);

		
		// Usando ArrayList => Tempo total gasto pelo processo: 1345
		// Usando HashSet => Tempo total gasto pelo processo: 22
		// Diferença absurda e tratando-se de um simples wrapper
	}

}
