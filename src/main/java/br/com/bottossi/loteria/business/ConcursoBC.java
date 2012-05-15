package br.com.bottossi.loteria.business;

import br.com.bottossi.loteria.domain.Concurso;
import br.com.bottossi.loteria.persistence.ConcursoDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@BusinessController
public class ConcursoBC extends DelegateCrud<Concurso, Long, ConcursoDAO> {
	
	private static final long serialVersionUID = 1L;
	
	
}
