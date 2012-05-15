package br.com.bottossi.loteria.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Concurso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Integer numero;
	
	//private List<Integer> dezenas;

	
	
	public Long getId() {
		return id;
	}

	public Concurso(Integer numero) {
		super();		
		this.numero = numero;
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
		
		
	
	
}
