package ex2_executarCirculo;

import ex2_circulo.Circulo;

public class Executar {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		
		circulo.setRaio(5);
		circulo.calcularArea();
		circulo.calcularPerimetro();

	}

}
