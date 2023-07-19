package cliente;

import java.io.Serializable;


public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private double conta;


	public Cliente(int id, String nome, double conta) {
		this.id = id;
		this.nome = nome;
		this.conta = conta;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getConta() {
		return conta;
	}
	public void setConta(double conta) {
		this.conta = conta;
	}

	
	@Override
	public String toString() {
		return "Cliente: " + nome + ", com o id: " + id + ", tem um saldo de compras de: " + conta + "\n";
	}
	
	
}
