package menu;

import java.util.Vector;

import javax.swing.JOptionPane;

import cliente.Cliente;
import cliente.Operacoes_Cliente;
import farmancia.Caixa;
import produto.Operacoes_Produto;
import produto.Produto;

public class Menu {
	
	Operacoes_Cliente opCliente = new Operacoes_Cliente();
	Operacoes_Produto opProduto = new Operacoes_Produto();
	Caixa caixa = new Caixa();
	
	
	
	
	public void menuPrincipal(Vector <Cliente> vCliente, Vector <Produto> vProduto) {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Farmacia \n1-Clientes \n2-Produtos \n3-Inventarios \n4-Vendas \n5-Relatorios"));
		if (escolha == 1) {
			menuCliente(vCliente, vProduto);
		}
		else if (escolha == 2) {
			menuProduto(vCliente, vProduto);
		}
		else if (escolha == 3) {
			inventario(vProduto);
			menuPrincipal(vCliente, vProduto);
		}
		else if (escolha == 4) {
			vendas(vCliente, vProduto);
			menuPrincipal(vCliente, vProduto);
		}
		else if (escolha == 5) {
			relatorio(vProduto);
			menuPrincipal(vCliente, vProduto);
		}
		else {
			System.exit(0);
		}
	}
	
	public void menuCliente(Vector <Cliente> vCliente, Vector <Produto> vProduto) {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Clientes \n1-Ver Clientes \n2-Criar \n3-Editar \n4-Remover \n5-Pesquisar \n6-Voltar"));
		if (escolha == 1) {
			opCliente.listar(vCliente);
			menuCliente(vCliente, vProduto);
		}
		else if (escolha == 2) {
				opCliente.criar(vCliente);
				menuCliente(vCliente, vProduto);
		}
		else if (escolha == 3) {
			opCliente.actualizar(vCliente);
			menuCliente(vCliente, vProduto);
		}
		else if (escolha == 4) {
			opCliente.remover(vCliente);
			menuCliente(vCliente, vProduto);
		}
		else if (escolha == 5) {
			opCliente.pesquisar(vCliente);
			menuCliente(vCliente, vProduto);
		}
		else if (escolha == 6) {
			menuPrincipal(vCliente, vProduto);
		}
		else {
			System.exit(0);
		}
	}
	
	public void menuProduto(Vector <Cliente> vCliente,  Vector <Produto> vProduto) {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Produtos \n1-Ver Produtos \n2-Criar \n3-Editar \n4-Remover \n5-Pesquisar \n6-Aumentar Stock \n7-Voltar"));
		if (escolha == 1) {
			opProduto.listar(vProduto);
			menuProduto(vCliente, vProduto);
		}
		else if (escolha == 2) {
			opProduto.criar(vProduto);
			menuProduto(vCliente, vProduto);
		}
		else if (escolha == 3) {
			opProduto.actualizar(vProduto);
			menuProduto(vCliente, vProduto);
		}
		else if (escolha == 4) {
			opProduto.remover(vProduto);
			menuProduto(vCliente, vProduto);
		}
		else if (escolha == 5) {
			opProduto.pesquisar(vProduto);
			menuProduto(vCliente, vProduto);
		}
		else if (escolha == 6) {
			opProduto.aumentarStock(vProduto);
			menuProduto(vCliente, vProduto);
		}
		else if (escolha == 7) {
			menuPrincipal(vCliente, vProduto);
		}
		else {
			System.exit(0);
		}
	}
	
	public void inventario(Vector <Produto> vProduto) {
		opProduto.painelInventario(vProduto);
	}
	
	public void vendas(Vector <Cliente> vCliente, Vector <Produto> vProduto) {
		caixa.vender(vCliente, vProduto);
	}
	
	public void relatorio(Vector <Produto> vProduto) {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Relatorio\n1-Produtos mais vendidos\n2-Produtos em baixa"));
		if (escolha == 1) {
			opProduto.listarProdutosmaisVendidos(vProduto);
		}
		else if(escolha == 2) {
			opProduto.produtosEmBaixa(vProduto);
		}
	}
}
