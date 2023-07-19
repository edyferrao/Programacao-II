package ex2;

public abstract class Veiculo {
	
	private double velocidade;
	
	public Veiculo(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public abstract double acelerar();
	
	public abstract double frear();

	@Override
	public String toString() {
		return "Veiculo [velocidade=" + velocidade + "]";
	}
	
	
}
