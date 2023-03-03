package ifba.elementos;
import java.util.Date;

public abstract class Rodape {
	Date data;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public abstract String getOutput();
}
