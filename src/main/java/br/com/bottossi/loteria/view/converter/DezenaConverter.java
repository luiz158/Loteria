package br.com.bottossi.loteria.view.converter;

import java.util.Collection;
import java.util.Formatter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.bottossi.loteria.domain.Dezena;

@FacesConverter("br.com.bottossi.loteria.view.converter.DezenaConverter")
public class DezenaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		StringBuilder str = new StringBuilder();
		Collection<Dezena> dezenas = (Collection) arg2;
		
		
		for (Dezena dezena : dezenas) {
			str.append(String.format("%02d", dezena.getId()) + " ");
		}
		return str.toString();
	}

}
