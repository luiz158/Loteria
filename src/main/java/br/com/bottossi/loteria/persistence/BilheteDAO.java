package br.com.bottossi.loteria.persistence;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.com.bottossi.loteria.domain.Bilhete;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class BilheteDAO extends JPACrud<Bilhete, Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	@SuppressWarnings("unused")
	private Logger logger;
	
}
