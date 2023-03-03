package ifba.elementos.html;

import ifba.elementos.Cabecalho;

public class CabecalhoHTML extends Cabecalho {

	@Override
	public String getOutput() {
		return "<html><head><title>" + getTitulo() + "</title></head><body>\n" +
				"<h1>" + getTitulo() + "</h1>\n" +
				"<h2>" + getEmpresa() + "</h2>\n";
	}
}
