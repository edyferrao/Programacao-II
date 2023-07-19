package ex1_aluno;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private int idade;
	private int matricula;
	private int nota;
	
	Scanner input = new Scanner (System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public void situacao() {
		double media = 0;
		int aux = 0;
		int soma = 0;
		for (int i= 0; i < 3; i++) {
			System.out.println("Insira uma nota: ");
			aux = input.nextInt();
			setNota(aux);
			soma = soma + getNota();
		}
		
		media = soma / 3;
		
		if (media > 7) {
			System.out.println("O aluno: "+getNome()+" de "+getIdade()+" anos, com o numero de matricula: "+getMatricula()+" foi APROVADO com uma media de "+media);
		}
		else {
			System.out.println("O aluno: "+getNome()+" de "+getIdade()+" anos, com o numero de matricula: "+getMatricula()+" foi REPROVADO com uma media de "+media);
		}
	}
	
}
