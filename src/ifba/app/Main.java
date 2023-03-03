package ifba.app;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao criador = new CriadorDocumentacao(TipoDocumento.HTML);
		System.out.println(criador.geraDocumentacao());
	}

}
