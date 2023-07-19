package pessoa;

public class Estudante extends Pessoa {
	private int anoEscolar;

	public int getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(int anoEscolar) {
		this.anoEscolar = anoEscolar;
	}
	
	public void matricular() {
		System.out.println("Matriculando");
	}
	
	public void estudar() {
		System.out.println("Estudar");
	}
}
