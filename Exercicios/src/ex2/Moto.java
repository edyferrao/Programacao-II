package ex2;

public final class Moto extends Veiculo {

	public Moto(double velocidade) {
		super(velocidade);
	}

	@Override
	public double acelerar() {
		setVelocidade(getVelocidade() + 20);
		return getVelocidade();
	}

	@Override
	public double frear() {
		setVelocidade(getVelocidade() - 10);
		return getVelocidade();
	}

}
