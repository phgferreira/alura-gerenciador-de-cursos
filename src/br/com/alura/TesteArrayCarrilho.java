package br.com.alura;

import java.util.Arrays;
import java.util.List;

public class TesteArrayCarrilho {

	public static void main(String[] args) {
		List<Integer> itens = Arrays.asList( 11, 10, 16, 5, 85 );

		long inicio = System.currentTimeMillis();
		itens.forEach(item->System.out.println(item));
		long fim = System.currentTimeMillis();
		System.out.println("Tempo total 1: " + (fim - inicio));

		inicio = System.currentTimeMillis();
		for (Integer item : itens) {
		       System.out.println(item);
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo total 2: " + (fim - inicio));
	
	}
}
