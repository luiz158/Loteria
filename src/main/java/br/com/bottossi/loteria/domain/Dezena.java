package br.com.bottossi.loteria.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DEZENA")
public class Dezena implements Serializable, Comparable<Dezena> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DEZ_ID")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dezena() {
		super();
	}

	@Override
	public String toString() {		
		return id.toString();		
	}

	@Override
	public int compareTo(Dezena o) {
		return this.getId().compareTo(o.getId());
	}
	
}
