package ex2_circulo;

public class Circulo {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		double area = 0;
		area = 3.14 * (raio * raio);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 0;
		perimetro = 2 * 3.14 * raio;
		return perimetro;
	}

}
