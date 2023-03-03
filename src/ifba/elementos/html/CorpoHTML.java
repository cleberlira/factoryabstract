package ifba.elementos.html;

import ifba.elementos.Corpo;

public class CorpoHTML extends Corpo {

	@Override
	public String getOutput() {
		return "<p>" + getTexto() + "</p>";
	}

}
