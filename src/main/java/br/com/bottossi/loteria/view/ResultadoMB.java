package br.com.bottossi.loteria.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.commons.collections.list.TreeList;

import br.com.bottossi.loteria.business.ResultadoBC;
import br.com.bottossi.loteria.domain.Concurso;
import br.com.bottossi.loteria.domain.Resultado;
import br.gov.frameworkdemoiselle.stereotype.ViewController;

@ViewController
public class ResultadoMB {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ResultadoBC resultadoBC;
		
	private Map<Concurso, List<Resultado>> resultados;
	
	public Map<Concurso, List<Resultado>> getResultados() {
		return resultados;
	}
	
	public void setResultados(Map<Concurso, List<Resultado>> resultados) {
		this.resultados = resultados;
	}
	
	@PostConstruct
	public void init() {
		resultados = resultadoBC.selecionaResultados();
	}
	
	public List<Concurso> getConcursos() {	    
        List<Concurso> ret = new ArrayList<Concurso>();
        for (Concurso s : resultados.keySet())
            ret.add(s);
        return ret;	    
	}	
	
}
