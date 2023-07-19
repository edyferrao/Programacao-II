package ex1;

public class CamaroteInferior extends VIP{
	private String localização;

	public String getLocalização() {
		return localização;
	}

	public void setLocalização(String localização) {
		this.localização = localização;
	}
	
	
	public void imprimirLocalização() {
		System.out.println(getLocalização());
	}
}
