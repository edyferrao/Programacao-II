package aluno;

public class Aluno {
	
	private String nome;
	private int numero;
	private String turma;
	
	
	public Aluno(String nome, int numero, String turma) {
		this.nome = nome;
		this.numero = numero;
		this.turma = turma;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}


	@Override
	public String toString() {
		return "Aluno de nome: " + nome + ", com o numero: " + numero + ", encontra-se na turma: " + turma + "\n";
	}
	
	
}
