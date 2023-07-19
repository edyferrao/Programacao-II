package exercicio;

public final class Gerente extends Funcionario {

	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public double calcularPagamento(double salarioBase) {
		setBonus(salarioBase * 20 / 100);
		setDesconto(salarioBase * 10 / 100);
		return salario = salarioBase + bonus - desconto;
	}

	@Override
	public String toString() {
		return super.toString() + " e tem um salario final de : "+salario;
	}
	
	

}
