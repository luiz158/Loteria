package br.com.bottossi.loteria.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

import br.com.bottossi.loteria.business.ConcursoBC;
import br.com.bottossi.loteria.domain.Concurso;

@ViewController
@NextView("/concurso_edit.xhtml")
@PreviousView("/concurso_list.xhtml")
public class ConcursoListMB extends AbstractListPageBean<Concurso, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private ConcursoBC bc;

	@Override
	protected List<Concurso> handleResultList() {
		return this.bc.findAll();
	}

	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long> iter = getSelection().keySet().iterator(); iter.hasNext();) {
			Long id = iter.next();
			delete = getSelection().get(id);

			if (delete) {
				bc.delete(id);
				iter.remove();
			}
		}
		return getPreviousView();
	}

}
