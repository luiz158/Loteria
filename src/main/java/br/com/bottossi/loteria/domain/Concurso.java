package br.com.bottossi.loteria.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Concurso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Integer numero;
	
	@OneToMany(mappedBy="concurso", cascade=CascadeType.ALL)
	private Set<Dezena> dezenas;
		

	public Concurso() {
		super();
	}
	
	public Concurso(Integer numero, Set<Dezena> dezenas) {
		super();		
		this.numero = numero;
		this.dezenas = dezenas;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
		
	public Set<Dezena> getDezenas() {
		return dezenas;
	}
	
	public void setDezenas(Set<Dezena> dezenas) {
		this.dezenas = dezenas;
	}
		
	
	
}
