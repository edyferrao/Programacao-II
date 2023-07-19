package ex1;

public abstract class Electrodomestico {
	protected boolean estaLigado;
	protected String marca;
	protected int volume;
	
	
	public Electrodomestico(boolean estaLigado, String marca, int volume) {
		this.estaLigado = estaLigado;
		this.marca = marca;
		this.volume = volume;
	}


	public boolean isEstaLigado() {
		return estaLigado;
	}
	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public abstract boolean ligar();
	public abstract boolean desligar();
}
