package exercicio;

public final class Vendedor extends Funcionario {
	private double valorTotal;

	public Vendedor(String nome, double salarioBase, double valorTotal) {
		super(nome, salarioBase);
		this.valorTotal = valorTotal;
	}
	
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	@Override
	public double calcularPagamento(double salarioBase) {
		setBonus(valorTotal * 10 / 100);
		setDesconto(salarioBase * 5 / 100);
		return salario = salarioBase + bonus - desconto;
	}
	
	@Override
	public String toString() {
		return super.toString() +" e teve uma total de vendas de: "+valorTotal+ " e tem um salario final de : "+salario;
	}
	
}
