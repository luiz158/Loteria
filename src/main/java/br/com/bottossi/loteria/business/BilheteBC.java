package br.com.bottossi.loteria.business;

import br.com.bottossi.loteria.domain.Bilhete;
import br.com.bottossi.loteria.persistence.BilheteDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@BusinessController
public class BilheteBC extends DelegateCrud<Bilhete, Long, BilheteDAO> {
	
	private static final long serialVersionUID = 1L;
	
	
}
