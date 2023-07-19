package farmancia;

import java.util.Vector;

import cliente.Cliente;
import ficheiros.FicheiroCliente;
import ficheiros.FicheiroProdutos;
import menu.Menu;
import produto.Produto;

public class Farmacia {
	
	public static void main(String[] args) {		
		
		FicheiroCliente fc = new FicheiroCliente();
		FicheiroProdutos fp = new FicheiroProdutos();
		
		Vector <Cliente> vCliente = new Vector <Cliente> ();
		Vector <Produto> vProduto = new Vector <Produto> ();
		
		
		vCliente = fc.ler();
		vProduto = fp.ler();
		
		Menu menu = new Menu();
		menu.menuPrincipal(vCliente, vProduto);
		
	}
}
