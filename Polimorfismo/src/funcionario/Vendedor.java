package funcionario;

public class Vendedor extends Funcionario {
	private double comissao_vendas;

	public Vendedor(String nome, String numBI, double salario, double comissao_vendas) {
		super(nome, numBI, salario);
		this.comissao_vendas = comissao_vendas;
	}

	public double getComissao_vendas() {
		return comissao_vendas;
	}

	public void setComissao_vendas(double comissao_vendas) {
		this.comissao_vendas = comissao_vendas;
	}
	
	public double bonus() {
		return (getSalario() * 15 / 100);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Vendedor [comissao_vendas=" + comissao_vendas + "]";
	}
	
	
	
	
}
