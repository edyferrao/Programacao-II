package ex3;

import java.util.Vector;

import javax.swing.JOptionPane;

public class RunLoja {

	public static void main(String[] args) {
		
		Conta bci = new ContaCorrente("Edilson");
		Conta bim = new ContaPoupanca("Ferrão");
		
		bci.depositar(5000);
		bim.depositar(2000);
		
		Vector <Loja> v = new Vector <Loja>();
		Loja shop1 = new Loja("2M", 660);
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("1- Fazer compras \n2-Sair"));
		while (n == 1) {
			v.add(shop1);
			shop1.setV(v);
			n = Integer.parseInt(JOptionPane.showInputDialog("1- Fazer compras \n2-Sair"));
		}
		int conta = Integer.parseInt(JOptionPane.showInputDialog("1-Conta Corrente \n2-Conta Poupanca"));
		if (conta == 1) {
			shop1.setC(bci);
		}
		else if (conta == 2) {
			shop1.setC(bim);
		}
		else {
			System.exit(0);
		}

		System.out.println(shop1.valorPagamento());
		System.out.println(shop1.pagar(shop1.getValorPag()));
		System.out.println(shop1.totalVendas());
		
		System.out.println(shop1.getC().getSaldo());
		
	}

}
