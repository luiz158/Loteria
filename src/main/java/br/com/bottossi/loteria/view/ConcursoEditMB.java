package br.com.bottossi.loteria.view;

import javax.inject.Inject;

import br.com.bottossi.loteria.business.ConcursoBC;
import br.com.bottossi.loteria.domain.Concurso;
import br.com.bottossi.loteria.domain.Dezena;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@PreviousView("/concurso_list.xhtml")
public class ConcursoEditMB extends AbstractEditPageBean<Concurso, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private ConcursoBC concursoBC;
	
	private Dezena dezena = new Dezena();		

	public Dezena getDezena() {
		return dezena;
	}

	public void setDezena(Dezena dezena) {
		this.dezena = dezena;
	}

	@Override
	@Transactional
	public String delete() {
		this.concursoBC.delete(getId());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String insert() {
		this.concursoBC.insert(getBean());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String update() {
		this.concursoBC.update(getBean());
		return getPreviousView();
	}

	@Override
	protected void handleLoad() {
		setBean(this.concursoBC.load(getId()));
	}
	
	public String reinit() {
		this.dezena = new Dezena();
		return null;
	}

}