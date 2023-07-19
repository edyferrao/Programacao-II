package produto;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cliente.Cliente;
import ficheiros.FicheiroProdutos;


public class Operacoes_Produto {
	private final double IVA = 0.17;
	
	Vector <Produto> vCompras = new Vector <Produto> ();
	Vector <Integer> vqtd = new Vector <Integer> ();
	Vector <Double> subtotal = new Vector <Double> ();
	Vector <Calendar> datas = new Vector <Calendar> ();
	
	FicheiroProdutos fp = new FicheiroProdutos();

	
	Calendar data = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public void gravarP(Vector <Produto> v) {
		try {
			fp.gravar(v);
			JOptionPane.showMessageDialog(null,"Produto registrado com sucesso");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void criar(Vector<Produto> v) {
		int novoId = Integer.parseInt(JOptionPane.showInputDialog("Insira o id do produto"));
		String novoNome = JOptionPane.showInputDialog("Insira o nome do produto");
		double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preco do produto"));
		int novaQdt = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade:"));
		if (v.isEmpty()) {
			Produto p = new Produto(novoId, novoNome, novoPreco, novaQdt, 0);
			v.add(p);
			gravarP(v);
			
			
		}
		else {
			int temporaria = 0;
			for (int i = 0; i < v.size(); i++) {
				if (((Produto)v.get(i)).getNome().equalsIgnoreCase(novoNome) || ((Produto)v.get(i)).getCod_id() == novoId) {
					JOptionPane.showMessageDialog(null, "O nome ou id do produto já existe", "Erro", ERROR_MESSAGE );
					temporaria = 1;
				}
			}
			if (temporaria == 0) {
				Produto p = new Produto(novoId, novoNome, novoPreco, novaQdt, 0);
				v.add(p);
				gravarP(v);
			}
		}
	}
	
	public void actualizar(Vector <Produto> v) {
		int control = 0;
		if (v.isEmpty()) {
			control = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Produto Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String escolha = JOptionPane.showInputDialog("Insira o nome ou id do produto");
			for (int i = 0; i < v.size(); i++) {
				if (((Produto)v.get(i)).getNome().equalsIgnoreCase(escolha) || ((Produto)v.get(i)).getCod_id() == Integer.parseInt(escolha)) {
					control = 1;
					int idEdit = Integer.parseInt(JOptionPane.showInputDialog("Deseja actualizar?\n1-id\n2-nome\n3-preco"));
					if (idEdit == 1) {
						int novoId = Integer.parseInt(JOptionPane.showInputDialog("Insira o novo id do produto"));
						((Produto)v.get(i)).setCod_id(novoId);
						JOptionPane.showMessageDialog(null,"Id editado com sucesso");
						gravarP(v);
					}
					else if (idEdit == 2) {
						String novoNome = JOptionPane.showInputDialog("Insira o novo nome do produto");
						((Produto)v.get(i)).setNome(novoNome);
						JOptionPane.showMessageDialog(null,"Nome editado com sucesso");
						gravarP(v);
					}
					else if (idEdit == 3) {
						double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preco do produto"));
						((Produto)v.get(i)).setPreco(novoPreco);
						JOptionPane.showMessageDialog(null,"Preco editado com sucesso");
						gravarP(v);
					}
				}
			}
			if (control == 0) {
				JOptionPane.showMessageDialog(null, "Produto nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}

	public void remover(Vector <Produto> v) {
		int temporaria = 0;
		if (v.isEmpty()) {
			temporaria = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Produto Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String escolha = JOptionPane.showInputDialog("Insira o nome ou id do produto");
			for (int i = 0; i < v.size(); i++) {
				if (((Produto)v.get(i)).getNome().equalsIgnoreCase(escolha) || ((Produto)v.get(i)).getCod_id() == Integer.parseInt(escolha)) {
					temporaria = 1;
					int resposta =JOptionPane.showConfirmDialog(null, "Tem a certeza que ser remover?");
					if (resposta == JOptionPane.YES_OPTION) {
						v.remove(i);
						JOptionPane.showMessageDialog(null,"Produto removido com sucesso");
						gravarP(v);
					}
					else if (resposta == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null,"Operacao cancelada");
					}
				}
			}
			if (temporaria == 0) {
				JOptionPane.showMessageDialog(null, "Produto nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}
	Produto v;
	public void aumentarStock(Vector <Produto> v) {
		int control = 0;
		if (v.isEmpty()) {
			control = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Produto Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String localizarProduto = JOptionPane.showInputDialog("Insira o nome ou id do produto");
			for (int i = 0; i < v.size(); i++) {
				if (((Produto)v.get(i)).getNome().equalsIgnoreCase(localizarProduto) || ((Produto)v.get(i)).getCod_id() == Integer.parseInt(localizarProduto)) {
					control = 1;
					int novoQtd = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de produtos que deseja aumentar"));
					((Produto)v.get(i)).setQtd_stock(((Produto)v.get(i)).getQtd_stock() + novoQtd);
					JOptionPane.showMessageDialog(null,"Stock adicionado com sucesso");
					gravarP(v);
				}
			}
			if (control == 0) {
				JOptionPane.showMessageDialog(null, "Produto nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}
	
	public void listar(Vector <Produto> v) {
		DefaultTableModel model = new DefaultTableModel();
        
        // Definir as colunas
        model.addColumn("Cod. Id");
        model.addColumn("Nome");
        model.addColumn("Preco");
        model.addColumn("Quant. no stock");
        
        // Adicionar dados ao modelo
        for (int i = 0; i < v.size(); i++) {
        	model.addRow(new Object[]{((Produto)v.get(i)).getCod_id(), ((Produto)v.get(i)).getNome(), ((Produto)v.get(i)).getPreco(), ((Produto)v.get(i)).getQtd_stock()});
		}
        // Criar a tabela
        JTable table = new JTable(model);
        
        // Criar o painel de rolagem
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Exibir a tabela no JOptionPane
        JOptionPane.showMessageDialog(null, scrollPane, "Tabela de Objetos", JOptionPane.PLAIN_MESSAGE);
	}
	
	
	public void pesquisar(Vector <Produto> v) {
		int control = 0;
		if (v.isEmpty()) {
			control = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Produto Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String localizarProduto = JOptionPane.showInputDialog("Insira o nome ou id do produto");
			for (int i = 0; i < v.size(); i++) {
				if (((Produto)v.get(i)).getNome().equalsIgnoreCase(localizarProduto) || ((Produto)v.get(i)).getCod_id() == Integer.parseInt(localizarProduto)) {
					control = 1;
					JOptionPane.showMessageDialog(null, v.get(i));
				}
			}
			if (control == 0) {
				JOptionPane.showMessageDialog(null, "Produto nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}
	
	public double precoFinal(Vector <Produto> v, Produto p) {
		double precoIva = 0;
		for (int i = 0; i < v.size(); i++) {
			if (v.elementAt(i) == p) {
				precoIva = (v.get(i)).getPreco() + ((v.get(i)).getPreco() * IVA);
			}
		}
		return precoIva;
	}
	
	public void comprado(Vector <Produto> v, Cliente c) {
		int control = 0;
		if (v.isEmpty()) {
			control = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Produto Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String produtoLevado = JOptionPane.showInputDialog("Insira o nome ou id do Produto");
			for (int i = 0; i < v.size(); i++) {
				if (((Produto)v.get(i)).getNome().equalsIgnoreCase(produtoLevado) || ((Produto)v.get(i)).getCod_id() == Integer.parseInt(produtoLevado)) {
					control = 1;
					int qtdLevar = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
					if (((Produto)v.get(i)).getQtd_stock() < qtdLevar || v.get(i).getQtd_stock() == 0) {
						JOptionPane.showMessageDialog(null, "Quantidade insufiente!\nQuantidade disponivel: " + ((Produto)v.get(i)).getQtd_stock(), "Erro", ERROR_MESSAGE );
					}
					else {
						vCompras.add((Produto)v.get(i));
						vqtd.add(qtdLevar);
						JOptionPane.showMessageDialog(null,"Adicionado Ao Carrinho");
					}
				}
			}
			if (control == 0) {
				JOptionPane.showMessageDialog(null, "Produto nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}
	
	public void painelDePagamento(Vector <Produto> v, Cliente c) {
		DefaultTableModel model = new DefaultTableModel();
        
        // Definir as colunas/
        model.addColumn("Cod. Id");
        model.addColumn("Nome");
        model.addColumn("Preco");
        model.addColumn("Preco com IVA");
        model.addColumn("Quant");
        model.addColumn("Subtotal");
        
        double total = 0;
        for (int i = 0; i < vCompras.size(); i++) {
			total = total + precoFinal(vCompras, vCompras.elementAt(i)) * vqtd.get(i);
			subtotal.add(precoFinal(vCompras, vCompras.elementAt(i)) * vqtd.get(i));
		}
        
        // Adicionar dados ao modelo
        for (int i = 0; i < vCompras.size(); i++) {
        	model.addRow(new Object[]{(vCompras.get(i)).getCod_id(), (vCompras.get(i)).getNome(), (vCompras.get(i)).getPreco(), precoFinal(vCompras, vCompras.get(i)), vqtd.get(i), subtotal.get(i)});
		}
        // Criar a tabela
        JTable table = new JTable(model);
        // Cria um JLabel para a mensagem
        JLabel mensagemLabel = new JLabel("    Total a pagar é: " + total);

        // Cria um JPanel e define o layout para organizar a tabela e a mensagem
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // Criar o painel de rolagem
        JScrollPane scrollPane = new JScrollPane(table);
        
	     // Adiciona a tabela e a mensagem ao JPanel
	        panel.add(scrollPane);
	        panel.add(mensagemLabel);

        
        // Exibir a tabela no JOptionPane
        JOptionPane.showMessageDialog(null, panel, "Tabela de Objetos", JOptionPane.PLAIN_MESSAGE);
        int resposta = JOptionPane.showConfirmDialog(table, "Efectuar compra?");
        if (resposta == JOptionPane.YES_OPTION) {
        	double aux = 0;
        	for (int i = 0; i < v.size(); i++) {
				for (int j = 0; j < vCompras.size(); j++) {
					if (v.elementAt(i) == vCompras.elementAt(j)) {
						((Produto)v.get(i)).setQtd_stock(((Produto)v.get(j)).getQtd_stock() - vqtd.get(j));
						((Produto)v.get(i)).setCont_compras(((Produto)v.get(j)).getCont_compras() + vqtd.get(j));
						aux = aux + (precoFinal(vCompras, (Produto)v.get(j))) * vqtd.get(j);
					}
				}
			}
        	c.setConta(aux);
        	vCompras.clear();
			vqtd.clear();
			gravarP(v);
			
			
        }
        else if (resposta == JOptionPane.NO_OPTION) {
        	vCompras.clear();
			vqtd.clear();
        }
	}
	
	public void painelInventario(Vector <Produto> v) {
		DefaultTableModel model = new DefaultTableModel();
        
        // Definir as colunas
        model.addColumn("Cod. Id");
        model.addColumn("Nome");
        model.addColumn("Preco");
        model.addColumn("Quant. no stock");
        
        // Adicionar dados ao modelo
        for (int i = 0; i < v.size(); i++) {
        	model.addRow(new Object[]{((Produto)v.get(i)).getCod_id(), ((Produto)v.get(i)).getNome(), ((Produto)v.get(i)).getPreco(), ((Produto)v.get(i)).getQtd_stock()});
		}
        
        // Criar a tabela
        JTable table = new JTable(model);
        JLabel mensagemLabel = new JLabel(sdf.format(data.getTime()));

        // Cria um JPanel e define o layout para organizar a tabela e a mensagem
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // Criar o painel de rolagem
        JScrollPane scrollPane = new JScrollPane(table);
        
	     // Adiciona a tabela e a mensagem ao JPanel
        panel.add(mensagemLabel);    
        panel.add(scrollPane);

        
        // Exibir a tabela no JOptionPane
        JOptionPane.showMessageDialog(null, panel, "Tabela de Objetos", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void listarProdutosmaisVendidos(Vector <Produto> v) {
		DefaultTableModel model = new DefaultTableModel();
		Vector <Produto> temporario = new Vector <Produto> ();
		
		for (int i = 0; i < v.size(); i++) {
			temporario.add((Produto)v.get(i));
		}
		
		for (int i = 0; i < v.size(); i++) {
			for (int j = 0; j < v.size(); j++) {
				if (temporario.get(i).getCont_compras() > temporario.get(j).getCont_compras()) {
					Produto temp = temporario.get(i);
					temporario.set(i, temporario.get(j));
					temporario.set(j, temp);
				}
			}
		}
		
        // Definir as colunas
		model.addColumn("Compras");
        model.addColumn("Cod. Id");
        model.addColumn("Nome");
        model.addColumn("Preco");
        model.addColumn("Quant. no stock");
        
        // Adicionar dados ao modelo
        for (int i = 0; i < temporario.size(); i++) {
        	model.addRow(new Object[]{temporario.get(i).getCont_compras(),(temporario.get(i)).getCod_id(), (temporario.get(i)).getNome(), (temporario.get(i)).getPreco(), (temporario.get(i)).getQtd_stock()});
		}
        // Criar a tabela
        JTable table = new JTable(model);
        
        // Criar o painel de rolagem
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Exibir a tabela no JOptionPane
        JOptionPane.showMessageDialog(null, scrollPane, "Tabela de Objetos", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void produtosEmBaixa(Vector <Produto> v) {
		DefaultTableModel model = new DefaultTableModel();
		
		Vector <Produto> temporario = new Vector <Produto> ();
		
		for (int i = 0; i < v.size(); i++) {
			temporario.add((Produto)v.get(i));
		}
		
		for (int i = 0; i < v.size(); i++) {
			for (int j = 0; j < v.size(); j++) {
				if (temporario.get(i).getQtd_stock() < temporario.get(j).getQtd_stock()) {
					Produto temp = temporario.get(i);
					temporario.set(i, temporario.get(j));
					temporario.set(j, temp);
				}
			}
		}
        
        // Definir as colunas
        model.addColumn("Cod. Id");
        model.addColumn("Nome");
        model.addColumn("Preco");
        model.addColumn("Quant. no stock");
        
        
        
        // Adicionar dados ao modelo
        for (int i = 0; i < temporario.size(); i++) {
        	if (temporario.get(i).getQtd_stock() <= 5) {
        		model.addRow(new Object[]{(temporario.get(i)).getCod_id(), (temporario.get(i)).getNome(), (temporario.get(i)).getPreco(), (temporario.get(i)).getQtd_stock()});
        	}
		}
        // Criar a tabela
        JTable table = new JTable(model);
        
        // Criar o painel de rolagem
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Exibir a tabela no JOptionPane
        JOptionPane.showMessageDialog(null, scrollPane, "Tabela de Objetos", JOptionPane.PLAIN_MESSAGE);
	}
}
