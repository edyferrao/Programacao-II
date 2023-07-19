package exercicio;

public final class Atendente extends Funcionario {
	
	private final double BONUS_AT = 200;

	public Atendente(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public double calcularPagamento(double salarioBase) {
		setBonus(BONUS_AT);
		setDesconto(salarioBase * 8 / 100);
		return salario = salarioBase + bonus - desconto;
	}
	
	@Override
	public String toString() {
		return super.toString() + "e tem um salario final de : "+salario;
	}
	
}
