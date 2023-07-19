package ex1;

public class VIP extends Bilhete{
	protected int valorAdicional;

	public int getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public int bilheteVIP() {
		valor = valor + valorAdicional;
		return getValor();
	}
}
