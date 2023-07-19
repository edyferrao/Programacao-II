package exercicio;

public class Empresa {
	
	private double total;
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	
	public double calcularFolhaPagamento(Funcionario f) {
		return total = total + f.calcularPagamento(f.salarioBase);
	}

	@Override
	public String toString() {
		return "A empresa tem um valor total a pagar de: "+ total;
	}
	
	
}
