package ex1;

public class Bilhete {
	protected int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void imprimeValor() {
		System.out.println(getValor()+"MT");
	}
}
