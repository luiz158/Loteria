package br.com.bottossi.loteria.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Concurso implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numero;

	private Set<Integer> dezenas = new HashSet<Integer>();

	public Concurso() {
		super();
	}

	public Concurso(Integer numero, Set<Integer> dezenas) {
		super();
		this.numero = numero;
		this.dezenas = dezenas;
	}	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Set<Integer> getDezenas() {
		return dezenas;
	}

	public void setDezenas(Set<Integer> dezenas) {
		this.dezenas = dezenas;
	}

}
