package br.com.bottossi.loteria.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import br.com.bottossi.loteria.business.BilheteBC;
import br.com.bottossi.loteria.business.DezenaBC;
import br.com.bottossi.loteria.domain.Bilhete;
import br.com.bottossi.loteria.domain.Dezena;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.annotation.ViewScoped;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@ViewScoped
@PreviousView("/bilhete_list.xhtml")
public class BilheteEditMB extends AbstractEditPageBean<Bilhete, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private BilheteBC bilheteBC;	
	
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
		this.bilheteBC.delete(getId());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String insert() {		
		loadDezenasSelecionadas();
		this.bilheteBC.insert(getBean());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String update() {
		loadDezenasSelecionadas();
		this.bilheteBC.update(getBean());
		return getPreviousView();
	}

	@Override
	protected void handleLoad() {
		setBean(this.bilheteBC.load(getId()));		
		loadDezenasFromBean();
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
			getBean().setDezenas(new TreeSet<Dezena>());
			for (Integer id : dezenasSelecionadas) {
				getBean().getDezenas().add(dezenasDisponiveis.get(id));
			}
		}
	}
	
	private void loadDezenasFromBean() {
		dezenasSelecionadas = new ArrayList<Integer>();
		for (Dezena dezena : getBean().getDezenas()) {
			dezenasSelecionadas.add(dezena.getId());
		}
	}

}
