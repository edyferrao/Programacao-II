package pessoa;

public class Trabalhador extends Pessoa {
	private String categoria;
	private String função;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFunção() {
		return função;
	}
	public void setFunção(String função) {
		this.função = função;
	}
	
	public void trabalhar() {
		System.out.println("Trabalhando");
	}
	
	public void porCartão() {
		System.out.println("Cartão validado");
	}
}
