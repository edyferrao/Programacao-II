package ex2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pessoa {

	public int id;
	public String nome;
	public int idade;
	public int qtdAniver;
	
	Scanner input = new Scanner(System.in);
	
	public void CompletarAniversario () {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Completar anos? \n1-Nao \n2-Sim"));
		while (n == 2) {
			idade = idade + 1;
			qtdAniver ++;
			n = Integer.parseInt(JOptionPane.showInputDialog("Completar anos? \n1-Nao \n2-Sim"));
		}
	}
	
	public void CompletarAnos () {
		idade = idade + 1;
		qtdAniver ++;
	}
	
	public void imprimir () {
		JOptionPane.showMessageDialog(null, nome+" tem "+idade+"  anos e completou "+qtdAniver+" aniversarios");
	}
}
