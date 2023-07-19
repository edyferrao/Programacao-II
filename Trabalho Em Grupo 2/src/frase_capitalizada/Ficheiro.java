package frase_capitalizada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JOptionPane;

public abstract class Ficheiro {
	
	protected String ficheiro = "Frase Capitalizada.txt";
	protected String textoLido = ler(ficheiro);
	protected StringBuffer frase = new StringBuffer("");
	protected String linha;
	
	public String ler(String endereço) {
		try {
			FileReader ficheiro = new FileReader(endereço);
			BufferedReader lerFicheiro = new BufferedReader(ficheiro);
			try {
				linha = lerFicheiro.readLine();
				while (linha != null) {
					frase.append(linha+"\n");
					linha = lerFicheiro.readLine();
				}
				lerFicheiro.close();
				ficheiro.close();
				 return frase.toString();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Erro ao ler o ficheiro", "Erro", ERROR_MESSAGE );
				return "";
			}
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Ficheiro n�o encontrado", "Erro", ERROR_MESSAGE );
			return "";
		}
	}
	
	public boolean escrever (String endereço, StringBuffer texto) {
		
		try {
			FileWriter ficheiro = new FileWriter(endereço);
			PrintWriter gravar = new PrintWriter(ficheiro);
			gravar.print(texto);
			gravar.close();
			ficheiro.close();
			return true;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", ERROR_MESSAGE );
			return false;
		}
	}
}
