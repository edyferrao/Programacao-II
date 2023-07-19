package funcionario;

public class Administrador extends Funcionario {
	private int horasExtras;

	public Administrador(String nome, String numBI, double salario, int horasExtras) {
		super(nome, numBI, salario);
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public double bonus() {
		return (getSalario() * 20 / 100);
	}

	@Override
	public String toString() {
		return super.toString() +"Administrador [horasExtras=" + horasExtras + "]";
	}
	
	
}
