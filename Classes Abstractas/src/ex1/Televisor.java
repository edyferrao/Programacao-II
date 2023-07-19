package ex1;

public final class Televisor extends Electrodomestico {
	private String referencia;
	private int canal;
	
	public Televisor(boolean estaLigado, String marca, int volume, String referencia, int canal) {
		super(estaLigado, marca, volume);
		this.referencia = referencia;
		this.canal = canal;
	}

	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public boolean ligar() {
		return estaLigado = true;
	}
	@Override
	public boolean desligar() {
		volume = 0;
		canal = 0;
		return estaLigado = false;
	}
	
	

}
