package br.com.bottossi.loteria.domain;

import java.util.Set;

public class Bilhete {
	
	private Integer id;
	
	private Set<Integer> numeros;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(Set<Integer> numeros) {
		this.numeros = numeros;
	}

	public Bilhete() {
		super();	
	}

	public Bilhete(Integer id, Set<Integer> numeros) {
		super();
		this.id = id;
		this.numeros = numeros;
	}
	
	
}
