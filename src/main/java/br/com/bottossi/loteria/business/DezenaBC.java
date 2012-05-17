package br.com.bottossi.loteria.business;

import br.com.bottossi.loteria.domain.Dezena;
import br.com.bottossi.loteria.persistence.DezenaDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@BusinessController
public class DezenaBC extends DelegateCrud<Dezena, Integer, DezenaDAO> {
	
	private static final long serialVersionUID = 1L;
	
	
}
