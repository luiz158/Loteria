package br.com.bottossi.loteria.domain;

import java.io.Serializable;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CONCURSO")
public class Concurso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONC_ID")
	@SequenceGenerator(name = "SEQ_CONCURSO_GEN", sequenceName = "seq_concurso")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONCURSO_GEN")
	private Long id;

	@Column(name = "CONC_NUMERO", nullable = false)
	private Integer numero;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "TB_CONCURSO_DEZENA", joinColumns = { @JoinColumn(name = "CONC_ID", referencedColumnName = "CONC_ID") }, inverseJoinColumns = { @JoinColumn(name = "DEZ_ID", referencedColumnName = "DEZ_ID") })
	private Set<Dezena> dezenas;

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

	public Concurso() {
		super();
		// TODO Auto-generated constructor stub
	}

}
