package funcionario;

public class ControleBonus {
	private double totalBonus;

	public ControleBonus() {
		totalBonus = 0;
	}

	public double getTotalBonus() {
		return totalBonus;
	}

	public void setTotalBonus(double totalBonus) {
		this.totalBonus = totalBonus;
	}
	
	public double calculaBonus (Funcionario f) {
		totalBonus = totalBonus + f.bonus();
		return totalBonus;
	}
}
