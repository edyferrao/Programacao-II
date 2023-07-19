package produto;

import java.io.Serializable;

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cod_id;
	private String nome;
	private double preco;
	private int qtd_stock;
	private int cont_compras;
	
	public Produto(int cod_id, String nome, double preco, int qtd_stock, int cont_compras) {
		this.cod_id = cod_id;
		this.nome = nome;
		this.preco = preco;
		this.qtd_stock = qtd_stock;
		this.cont_compras = cont_compras;
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
	public int getCont_compras() {
		return cont_compras;
	}
	public void setCont_compras(int cont_compras) {
		this.cont_compras = cont_compras;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + ", com o id: " + cod_id + ", tem o preco de: " + preco + "\n";
	}
}
