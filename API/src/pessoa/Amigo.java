package pessoa;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Amigo extends Pessoa {
	private Calendar dataAniversario;

	public Amigo(String nome, String sexo, int idade, Calendar dataAniversario) {
		super(nome, sexo, idade);
		this.dataAniversario = dataAniversario;
	}

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return super.toString() +" tem a data de aniversario:" + sdf.format(dataAniversario.getTime());
	}
	
	
}
