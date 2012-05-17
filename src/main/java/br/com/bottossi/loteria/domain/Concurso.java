package br.com.bottossi.loteria.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_concurso")
public class Concurso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_CONCURSO_GEN", sequenceName = "seq_concurso")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONCURSO_GEN")
	private Long id;

	@Column(name = "numero", nullable = false)
	private Integer numero;

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

	public Concurso() {
		super();
		// TODO Auto-generated constructor stub
	}

}
