package funcionario;

public class Administradores extends Funcionario {
	private int horasExtras;

	public Administradores(String nome, String tipo_doc, int num_doc, int salario, int horasExtras) {
		super(nome, tipo_doc, num_doc, salario);
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public int calcularHorasExtras (int horas) {
		for (int i = 0; i < horas; i++) {
			horasExtras = horasExtras + (getSalario() / 100);
			System.err.println(horasExtras);
		}
		setSalario(getSalario() + horasExtras);
		return horasExtras;
	}

	@Override
	public String toString() {
		return super.toString() + "Administradores [horasExtras=" + horasExtras + "]";
	}
	
	
}
