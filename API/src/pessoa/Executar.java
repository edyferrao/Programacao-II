package pessoa;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Executar {

	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mes"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
		data.set(ano, mes -1, dia);
		Amigo amigo = new Amigo("Edilson", "Masculino", 23, data);
		System.out.println(amigo);
	}

}
