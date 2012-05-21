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
		concursos.put(
				752,
				new HashSet(Arrays.asList(1, 4, 5, 6, 7, 8, 12, 13, 14, 16, 18,
						19, 21, 24, 25)));
		concursos.put(
				753,
				new HashSet(Arrays.asList(1, 3, 4, 5, 6, 7, 8, 11, 13, 14, 17,
						20, 21, 22, 25)));
		concursos.put(
				754,
				new HashSet(Arrays.asList(1, 4, 5, 7, 13, 15, 16, 17, 18, 19,
						20, 22, 23, 24, 25)));

		BidiMap bilhetes = new DualHashBidiMap();
		bilhetes.put(
				1,
				new HashSet<Integer>(Arrays.asList(3, 4, 6, 7, 8, 11, 12, 14,
						15, 16, 17, 20, 21, 24, 25)));
		bilhetes.put(
				2,
				new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 6, 8, 12, 13,
						16, 18, 19, 21, 22, 24, 25)));
		bilhetes.put(
				3,
				new HashSet<Integer>(Arrays.asList(1, 2, 4, 5, 6, 7, 10, 12,
						13, 15, 16, 18, 21, 22, 24)));
		bilhetes.put(
				4,
				new HashSet<Integer>(Arrays.asList(2, 3, 4, 6, 12, 14, 15, 17,
						18, 19, 20, 21, 22, 24, 25)));
		bilhetes.put(
				5,
				new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 10, 11,
						12, 13, 15, 16, 19, 21, 25)));
		bilhetes.put(
				6,
				new HashSet<Integer>(Arrays.asList(2, 3, 4, 6, 10, 11, 14, 15,
						16, 17, 21, 22, 23, 24, 25)));
		bilhetes.put(
				7,
				new HashSet<Integer>(Arrays.asList(1, 3, 5, 6, 8, 10, 11, 13,
						15, 16, 18, 20, 21, 23, 25)));
		bilhetes.put(
				8,
				new HashSet<Integer>(Arrays.asList(1, 4, 6, 8, 9, 10, 12, 13,
						14, 16, 17, 20, 21, 22, 24)));
		bilhetes.put(
				9,
				new HashSet<Integer>(Arrays.asList(2, 3, 4, 7, 8, 9, 12, 13,
						15, 17, 18, 20, 22, 23, 24)));
		bilhetes.put(
				10,
				new HashSet<Integer>(Arrays.asList(3, 4, 6, 7, 10, 11, 14, 15,
						16, 17, 18, 19, 21, 24, 25)));
		bilhetes.put(
				11,
				new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 9, 10, 11, 13,
						14, 15, 17, 19, 20, 23, 25)));
		bilhetes.put(
				12,
				new HashSet<Integer>(Arrays.asList(2, 3, 5, 6, 7, 9, 11, 12,
						15, 16, 17, 19, 21, 23, 25)));
		bilhetes.put(
				13,
				new HashSet<Integer>(Arrays.asList(1, 2, 6, 9, 11, 12, 13, 14,
						15, 17, 19, 21, 23, 24, 25)));
		bilhetes.put(
				14,
				new HashSet<Integer>(Arrays.asList(1, 2, 3, 7, 8, 10, 11, 14,
						16, 18, 19, 20, 21, 22, 23)));
		bilhetes.put(
				15,
				new HashSet<Integer>(Arrays.asList(1, 2, 4, 5, 6, 9, 11, 13,
						15, 17, 19, 21, 22, 23)));
		bilhetes.put(
				16,
				new HashSet<Integer>(Arrays.asList(2, 3, 5, 7, 8, 10, 11, 12,
						14, 16, 18, 20, 21, 23, 24)));
		bilhetes.put(
				17,
				new HashSet<Integer>(Arrays.asList(1, 5, 7, 8, 9, 11, 12, 13,
						14, 15, 17, 18, 19, 21, 25)));
		bilhetes.put(
				18,
				new HashSet<Integer>(Arrays.asList(2, 3, 4, 6, 8, 10, 12, 13,
						14, 16, 18, 20, 22, 23, 24)));
		bilhetes.put(
				19,
				new HashSet<Integer>(Arrays.asList(2, 4, 5, 6, 8, 9, 12, 13,
						14, 16, 18, 20, 21, 22, 24)));
		bilhetes.put(
				20,
				new HashSet<Integer>(Arrays.asList(1, 2, 4, 6, 8, 10, 11, 12,
						15, 16, 18, 19, 22, 24, 25)));
		bilhetes.put(
				21,
				new HashSet<Integer>(Arrays.asList(1, 2, 4, 5, 7, 8, 9, 11, 12,
						14, 16, 19, 20, 22, 23)));
		bilhetes.put(
				22,
				new HashSet<Integer>(Arrays.asList(1, 2, 5, 6, 7, 8, 12, 13,
						14, 18, 19, 20, 21, 22, 25)));
		bilhetes.put(
				23,
				new HashSet<Integer>(Arrays.asList(1, 3, 6, 7, 8, 11, 12, 14,
						15, 16, 18, 19, 20, 22, 23)));
		bilhetes.put(
				24,
				new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 9, 11, 14,
						16, 19, 21, 22, 24, 25)));

		for (Object concurso : concursos.values()) {
			System.out.println("Concurso " + concursos.getKey(concurso));
			for (Object bilhete : bilhetes.values()) {
				Set<Integer> comum = new HashSet<Integer>((Set) concurso);
				comum.retainAll((Set) bilhete);
				System.out.println("Bilhete " + bilhetes.getKey(bilhete)
						+ " acertou " + comum.size() + ". Valores "
						+ comum.toString());
			}
			System.out.println("\n\n");
		}

	}

}
