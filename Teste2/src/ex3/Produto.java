package ex3;

public class Produto {
	private int cod_id;
	private String nome;
	private double preco;
	private int qtd_stock;
	
	
	public Produto(int cod_id, String nome, double preco, int qtd_stock) {
		this.cod_id = cod_id;
		this.nome = nome;
		this.preco = preco;
		this.qtd_stock = qtd_stock;
	}


	public int getCod_id() {
		return cod_id;
	}
	public void setCod_id(int cod_id) {
		this.cod_id = cod_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd_stock() {
		return qtd_stock;
	}
	public void setQtd_stock(int qtd_stock) {
		this.qtd_stock = qtd_stock;
	}


	@Override
	public String toString() {
		return "Produto com o codigo: " + cod_id + ", nome: " + nome + ", preco: " + preco + ", e stock: " + qtd_stock + "\n";
	}
	
	
}
