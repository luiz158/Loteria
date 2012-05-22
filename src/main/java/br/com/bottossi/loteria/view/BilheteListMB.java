package br.com.bottossi.loteria.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import br.com.bottossi.loteria.business.BilheteBC;
import br.com.bottossi.loteria.domain.Bilhete;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@NextView("/bilhete_edit.xhtml")
@PreviousView("/bilhete_list.xhtml")
public class BilheteListMB extends AbstractListPageBean<Bilhete, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private BilheteBC bc;

	@Override
	protected List<Bilhete> handleResultList() {
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
