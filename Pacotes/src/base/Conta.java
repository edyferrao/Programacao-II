package base;

import logica.Cliente;

public class Conta {
	
	private int id;
	private String nome;
	private int saldo;
	private Cliente cl;
	
	
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

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cliente getCl() {
		return cl;
	}

	public void setCl(Cliente cl) {
		this.cl = cl;
	}

	public void deposita(int dinheiro) {
		if (dinheiro > 0) {
			setSaldo(saldo+= dinheiro);
		}
		else {
			System.out.println("Erro ao depositar");
		}
	}
	
	public void imprimir() {
		System.out.println("O saldo do "+getId()+" ficou "+getSaldo());
	}
}
