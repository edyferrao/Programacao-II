package ex2;

import javax.swing.JOptionPane;

public class Executa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();

		
		pessoa.id = Integer.parseInt(JOptionPane.showInputDialog("Insira o Id:"));
		pessoa.nome = JOptionPane.showInputDialog("Insira o Nome:");
		pessoa.idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a Idade:"));
		
		//pessoa.CompletarAnos();
		//pessoa.CompletarAnos();
		//pessoa.CompletarAnos();
		//pessoa.CompletarAnos();
		pessoa.CompletarAniversario();
		pessoa.imprimir();

	}

}
