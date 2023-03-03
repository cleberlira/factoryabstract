package ifba.elementos;

public abstract class Corpo {
	String texto;
	String empresa;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public abstract String getOutput();
}
