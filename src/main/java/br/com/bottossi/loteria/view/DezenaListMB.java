package br.com.bottossi.loteria.view;

import java.util.List;

import javax.inject.Inject;

import br.com.bottossi.loteria.business.DezenaBC;
import br.com.bottossi.loteria.domain.Dezena;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
public class DezenaListMB extends AbstractListPageBean<Dezena, Integer> {

	private static final long serialVersionUID = 1L;

	@Inject
	private DezenaBC bc;

	@Override
	protected List<Dezena> handleResultList() {
		return this.bc.findAll();
	}

}
