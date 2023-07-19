package ex1;

public class CamaroteSuperior extends VIP {
	private int valorVipAdicional;

	public int getValorVipAdicional() {
		return valorVipAdicional;
	}

	public void setValorVipAdicional(int valorVipAdicional) {
		this.valorVipAdicional = valorVipAdicional;
	}
	
	public int camSup() {
		return bilheteVIP() + valorVipAdicional;
	}
}
