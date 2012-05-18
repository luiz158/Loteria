package br.com.bottossi.loteria.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import br.com.bottossi.loteria.business.ConcursoBC;
import br.com.bottossi.loteria.business.DezenaBC;
import br.com.bottossi.loteria.domain.Concurso;
import br.com.bottossi.loteria.domain.Dezena;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.annotation.ViewScoped;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@ViewScoped
@PreviousView("/concurso_list.xhtml")
public class ConcursoEditMB extends AbstractEditPageBean<Concurso, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private ConcursoBC concursoBC;	
	
	@Inject
	private DezenaBC dezenaBC;
	
	private Map<Integer, Dezena> dezenasDisponiveis;
	
	private List<SelectItem> dezenaSelectItems = new ArrayList<SelectItem>();
	
	private List<Integer> dezenasSelecionadas;
		
	
	public Map<Integer, Dezena> getDezenasDisponiveis() {
		return dezenasDisponiveis;
	}
	
	public void setDezenasDisponiveis(Map<Integer, Dezena> dezenasDisponiveis) {
		this.dezenasDisponiveis = dezenasDisponiveis;
	}

	public List<SelectItem> getDezenaSelectItems() {
		return dezenaSelectItems;
	}
	
	public void setDezenaSelectItems(List<SelectItem> dezenaSelectItems) {
		this.dezenaSelectItems = dezenaSelectItems;
	}
	
	
	public List<Integer> getDezenasSelecionadas() {
		return dezenasSelecionadas;
	}
	
	public void setDezenasSelecionadas(List<Integer> dezenasSelecionadas) {
		this.dezenasSelecionadas = dezenasSelecionadas;
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
		loadDezenasSelecionadas();
		this.concursoBC.insert(getBean());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String update() {
		loadDezenasSelecionadas();
		this.concursoBC.update(getBean());
		return getPreviousView();
	}

	@Override
	protected void handleLoad() {
		setBean(this.concursoBC.load(getId()));		
	}
	
	@PostConstruct
	public void init() {
		loadDezenas();			
	}
	
	private void loadDezenas() {
		Map<Integer, Dezena> mapDezenas = new HashMap<Integer, Dezena>();
		List<Dezena> dezenas = this.dezenaBC.findAll();
		if (dezenas != null) {
			for (Dezena dezena : dezenas) {
				mapDezenas.put(dezena.getId(), dezena);
				SelectItem item = new SelectItem(dezena.getId(), dezena.getId().toString());
				dezenaSelectItems.add(item);
			}			
		}
		setDezenasDisponiveis(mapDezenas);
	}
	
	private void loadDezenasSelecionadas() {
		if (dezenasSelecionadas != null) {
			for (Integer id : dezenasSelecionadas) {
				getBean().getDezenas().add(dezenasDisponiveis.get(id));
			}
		}
	}

}
