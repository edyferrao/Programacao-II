package ex3;

import java.util.Vector;

public class Loja implements Pagamento {
	private Vector <Loja> v;
	private String produto;
	private double preco;
	private Conta c;
	private double valorPag;
	
	public Loja(String produto, double preco) {
		this.produto = produto;
		this.preco = preco;
		this.valorPag = 0;
	}
	
	public Vector<Loja> getV() {
		return v;
	}
	public void setV(Vector<Loja> v) {
		this.v = v;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Conta getC() {
		return c;
	}
	public void setC(Conta c) {
		this.c = c;
	}
	public double getValorPag() {
		return valorPag;
	}
	public void setValorPag(double valorPag) {
		this.valorPag = valorPag;
	}


	@Override
	public boolean pagar(double valor) {
		return c.sacar(valor);
	}

	@Override
	public double valorPagamento() {
		for (int i = 0; i < v.size(); i++) {
			valorPag = valorPag + v.get(i).preco;
		}
		return valorPag;
	}
	
	public int totalVendas() {
		return v.size();
	}
	
}
