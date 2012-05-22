package br.com.bottossi.loteria.domain;

import java.util.Set;
import java.util.TreeSet;

public class Resultado {

	private Concurso concurso;
	
	private Bilhete bilhete;	
	
	private Set<Dezena> dezenasAcertadas;
	
	public Concurso getConcurso() {
		return concurso;
	}

	public void setConcurso(Concurso concurso) {
		this.concurso = concurso;
	}

	public Bilhete getBilhete() {
		return bilhete;
	}

	public void setBilhete(Bilhete bilhete) {
		this.bilhete = bilhete;
	}
	
	public Set<Dezena> getDezenasAcertadas() {
		return dezenasAcertadas;
	}

	public Resultado(Concurso concurso, Bilhete bilhete) {
		super();
		this.concurso = concurso;
		this.bilhete = bilhete;
		
		dezenasAcertadas = new TreeSet<Dezena>(concurso.getDezenas());	
		dezenasAcertadas.retainAll(bilhete.getDezenas());
	}
	
	public Integer getTotalDeAcertos() {						
		return dezenasAcertadas.size();
	}
	
	
}
