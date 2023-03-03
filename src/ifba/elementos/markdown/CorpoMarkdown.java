package ifba.elementos.markdown;

import ifba.elementos.Corpo;

public class CorpoMarkdown extends Corpo {

	@Override
	public String getOutput() {
		return getTexto() + "\n\n";
	}

}
