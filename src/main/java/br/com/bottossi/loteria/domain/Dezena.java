package br.com.bottossi.loteria.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_dezena")
public class Dezena implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="valor", unique=true, length=3, nullable=false)
	private Integer valor;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Dezena() {
		super(); 
	}
	
	

}
