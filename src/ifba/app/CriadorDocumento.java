package ifba.app;

import java.util.Date;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.html.CabecalhoHTML;
import ifba.elementos.html.CorpoHTML;
import ifba.elementos.html.RodapeHTML;
import ifba.elementos.markdown.CabecalhoMarkdown;
import ifba.elementos.markdown.CorpoMarkdown;
import ifba.elementos.markdown.RodapeMarkdown;

public class CriadorDocumento {
	private TipoDocumento tipoDocumento;
	
	public CriadorDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String geraDocumentacao() {
		Cabecalho cabecalho;
		Corpo corpo;
		Rodape rodape;
		
		if (tipoDocumento == TipoDocumento.HTML) {
			cabecalho = new CabecalhoHTML();
		} else {
			cabecalho = new CabecalhoMarkdown();
		}
		
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Insituto Federal da Bahia");
		
		if (tipoDocumento == TipoDocumento.HTML) {
			corpo = new CorpoHTML();
		} else {
			corpo = new CorpoMarkdown();
		}
		
		corpo.setTexto("Aula de padroes de projeto.");
		
		if (tipoDocumento == TipoDocumento.HTML) {
			rodape = new RodapeHTML();
		} else {
			rodape = new RodapeMarkdown();
		}
		
		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}
}
