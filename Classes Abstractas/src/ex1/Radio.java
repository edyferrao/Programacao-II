package ex1;

public final class Radio extends Electrodomestico {
	private double sintonia;
	private final String BANDA1_AM = "AM";
	private final String BANDA2_FM = "FM";
	private String banda;
	
	
	public Radio(boolean estaLigado, String marca, int volume, double sintonia, String banda) {
		super(estaLigado, marca, volume);
		this.sintonia = sintonia;
		this.banda = banda;
	}


	public double getSintonia() {
		return sintonia;
	}
	public void setSintonia(double sintonia) {
		this.sintonia = sintonia;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	public String getBANDA1_AM() {
		return BANDA1_AM;
	}
	public String getBANDA2_FM() {
		return BANDA2_FM;
	}


	@Override
	public boolean ligar() {
		return estaLigado = true;
	}
	@Override
	public boolean desligar() {
		return estaLigado = false;
	}
	
	
	
	
	
}
