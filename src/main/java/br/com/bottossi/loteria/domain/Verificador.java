package br.com.bottossi.loteria.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;

public class Verificador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		BidiMap concursos = new DualHashBidiMap();		
		concursos.put(100, new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16)));
					
		BidiMap bilhetes = new DualHashBidiMap();
		bilhetes.put(1, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)));
						
		for (Object concurso : concursos.values()) {
			System.out.println("Concurso " + concursos.getKey(concurso));
			for (Object bilhete : bilhetes.values()) {
				Set<Integer> comum = new HashSet<Integer>((Set) concurso);
				comum.retainAll((Set) bilhete);
				System.out.println("Bilhete " + bilhetes.getKey(bilhete) + " acertou " + comum.size() + ". Valores " + comum.toString());
			}
			System.out.println("\n\n");
		}
		
	}

}
