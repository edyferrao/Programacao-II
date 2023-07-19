package frase_capitalizada;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

public abstract class Palavra extends Ficheiro {
	protected StringBuffer novaFrase = new StringBuffer(textoLido);
	protected String palavra;
	
	Vector <String> v = new Vector <String>();
	
	public void PalavraCapitalizada() {
		if (textoLido.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Erro ao ler o ficheiro", "Erro", ERROR_MESSAGE );
		}
		else {
			JOptionPane.showMessageDialog(null, textoLido);
		}
		
		StringTokenizer partesDaFrase = new StringTokenizer(textoLido, " "); 
		while (partesDaFrase.hasMoreTokens()) {
            v.add(partesDaFrase.nextToken());
        }
		StringBuffer novaFrase = new StringBuffer(textoLido);
		for (int i = 0; i < v.size(); i++) {
			palavra = ((String) v.get(i));
			if (palavra.length() < 2 && i != 0) {
				novaFrase.append(" "+palavra);
			}
			else if (i == 0) {
				palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1);
				novaFrase.append(palavra);
			}
			else {
				palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1);
				novaFrase.append(" ").append(palavra);
			}
		}
		JOptionPane.showMessageDialog(null,novaFrase);
		escrever(ficheiro, novaFrase);
	}
}
