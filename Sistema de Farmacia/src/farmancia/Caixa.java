package farmancia;

import cliente.*;
import ficheiros.FicheiroCliente;
import produto.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

import java.io.IOException;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Caixa {
	
	Operacoes_Produto op2 = new Operacoes_Produto();
	Operacoes_Cliente oc = new Operacoes_Cliente();
	FicheiroCliente fc = new FicheiroCliente();
	
	
	public void vender(Vector <Cliente> vCliente, Vector <Produto> vProduto) {
		if (vCliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum Cliente Registrado");
		}
		else {
			int control = 0;
			String localizarCliente = JOptionPane.showInputDialog("Insira o nome ou id do Cliente");
			for (int i = 0; i < vCliente.size(); i++) {
				if (((Cliente)vCliente.get(i)).getNome().equalsIgnoreCase(localizarCliente) || ((Cliente)vCliente.get(i)).getId() == Integer.parseInt(localizarCliente)) {
					control = 1;
					op2.comprado(vProduto, vCliente.elementAt(i));
					int comprar = JOptionPane.showConfirmDialog(null, "Comprar mais algum produto");
					while (comprar == JOptionPane.YES_OPTION) {
						op2.comprado(vProduto, vCliente.elementAt(i));
						comprar = JOptionPane.showConfirmDialog(null, "Comprar mais algum produto");
						
					}
					if (comprar == JOptionPane.NO_OPTION) {
						op2.painelDePagamento(vProduto, (Cliente)vCliente.elementAt(i));
						try {
							fc.gravar(vCliente);
							JOptionPane.showMessageDialog(null,"Cliente registrado com sucesso");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						
						
					}
				}
			}
			if (control == 0) {
				int resposta =JOptionPane.showConfirmDialog(null, "Cliente nao encontrado!\nDeseja registrar?", "Erro", ERROR_MESSAGE );
				if (resposta == JOptionPane.YES_OPTION) {
					oc.criar(vCliente);
					vender(vCliente, vProduto);
				}
				else if (resposta == JOptionPane.NO_OPTION) {
					
				}
				else {
					System.exit(0);
				}
			}
		}
		
	}
	
	
}
