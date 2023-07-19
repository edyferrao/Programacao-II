package funcionario;

public abstract class Funcionario {
	private String nome;
	private String numBI;
	private double salario;
	
	
	public Funcionario(String nome, String numBI, double salario) {
		this.nome = nome;
		this.numBI = numBI;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumBI() {
		return numBI;
	}


	public void setNumBI(String numBI) {
		this.numBI = numBI;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double bonus();

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", numBI=" + numBI + ", salario=" + salario + "]";
	}
	
	
	
	
}
