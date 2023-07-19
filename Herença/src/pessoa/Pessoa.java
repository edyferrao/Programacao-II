package pessoa;

public class Pessoa {
	private String nome;
	private String endereço;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void comer() {
		System.out.println("Comendo");
	}
	
	public void dormir() {
		System.out.println("Dormindo");
	}
	
}
