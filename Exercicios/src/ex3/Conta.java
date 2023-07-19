package ex3;

public abstract class Conta {
	
	private String titular;
	private double saldo;
	
	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void depositar(double valor);
	public abstract boolean sacar(double valor);
	
	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}
