package br.com.bottossi.loteria.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import br.com.bottossi.loteria.domain.Bilhete;
import br.com.bottossi.loteria.domain.Concurso;
import br.com.bottossi.loteria.domain.Resultado;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;

@BusinessController
public class ResultadoBC {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ConcursoBC concursoBC;
	
	@Inject
	private BilheteBC bilheteBC;
	
	
	private List<Concurso> loadConcursos() {
		return concursoBC.findAll();
	}
	
	private List<Bilhete> loadBilhetes() {
		return bilheteBC.findAll();
	}
	
	public Map<Concurso, List<Resultado>> selecionaResultados() {
		List<Concurso> concursos = loadConcursos();
		List<Bilhete> bilhetes = loadBilhetes();
		return processaResultados(concursos, bilhetes);
	}
	
	private Map<Concurso, List<Resultado>> processaResultados(List<Concurso> concursos, List<Bilhete> bilhetes) {
		Map<Concurso, List<Resultado>> resultados = new HashMap<Concurso, List<Resultado>>();
				
		for (Concurso concurso : concursos) {
			List<Resultado> lista = new ArrayList<Resultado>();
			for (Bilhete bilhete : bilhetes) {
				Resultado resultado = new Resultado(concurso, bilhete);
				lista.add(resultado);
			}
			resultados.put(concurso, lista);
		}
		return resultados;
	}
}
