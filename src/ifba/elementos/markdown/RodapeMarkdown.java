package ifba.elementos.markdown;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ifba.elementos.Rodape;

public class RodapeMarkdown extends Rodape {

	@Override
	public String getOutput() {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return "------------------------------\n\n" + df.format(getData()) + "\n";
	}

}
