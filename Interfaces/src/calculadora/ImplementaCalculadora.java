package calculadora;

public class ImplementaCalculadora implements Calculadora{
	
	@Override
	public double somar (int a, int b) {
		return a + b;
	}

	@Override
	public double subtrair(int a, int b) {
		return a - b;
	}

	@Override
	public double multiplicar(int a, int b) {
		return a * b;
	}

	@Override
	public double dividir(int a, int b) {
		return a / b;
	}

	@Override
	public double raizQuadrada(int a) {
		return Math.sqrt(a);
	}
}
