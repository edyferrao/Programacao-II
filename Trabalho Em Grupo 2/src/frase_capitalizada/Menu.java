package frase_capitalizada;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Menu extends Palavra {
	
	public void menu() {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("1-Escrever no ficheiro\n2-Capitalizar"));
		if (escolha == 1) {
			StringBuffer texto = new StringBuffer();
			
			texto.append(JOptionPane.showInputDialog("Insira uma Frase"));
			
			if (escrever(ficheiro, texto)) {
				JOptionPane.showMessageDialog(null, " salvo com sucesso");
				menu();
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo", "Erro", ERROR_MESSAGE );
				menu();
			}
		}
		if (escolha == 2) {
			PalavraCapitalizada();
			menu();
		}
		else {
			System.exit(0);
		}
	}
}
