package exercicio;

public abstract class Funcionario implements Pagamento {
	protected String nome;
	protected double salarioBase;
	protected double bonus;
	protected double desconto;
	protected double salario;
	
	
	public Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;	
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}


	@Override
	public String toString() {
		return "O funcionario: " +nome+ " tem um salario base de: "+salarioBase+ " e tem um bonus de: "+bonus+" e um desconto de: "+desconto;
	}

}
