package br.com.bottossi.loteria.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BILHETE")
@SequenceGenerator(name = "SEQ_BILHETE_GEN", sequenceName = "seq_bilhete")
public class Bilhete {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "BILH_ID")	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BILHETE_GEN")
	private Long id;
	
	@ManyToMany(fetch = FetchType.LAZY)		
	@JoinTable(name = "TB_BILHETE_DEZENA", joinColumns = { @JoinColumn(name = "BILH_ID", referencedColumnName = "BILH_ID") }, inverseJoinColumns = { @JoinColumn(name = "DEZ_ID", referencedColumnName = "DEZ_ID") })
	@OrderBy("id")
	private Set<Dezena> dezenas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Dezena> getDezenas() {
		return dezenas;
	}
	
	public void setDezenas(Set<Dezena> dezenas) {
		this.dezenas = dezenas;
	}

	public Bilhete() {
		super();	
	}
	
	
}
