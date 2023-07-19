package ex3;


import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Tomate Sauce", 120 , 24);
		Produto p2 = new Produto(2, "Agua 1.5L", 40 , 500);
		Produto p3 = new Produto(3, "Chocolate", 100 , 50);
		Produto p4 = new Produto(4, "Farinha", 55 , 20);
		Produto p5 = new Produto(5, "Carregador Type-C", 1200 , 5);
		Produto p6 = new Produto(6, "Coca-Cola 2L", 90 , 65);
		Produto p7 = new Produto(7, "Doritos", 110 , 30);
		Produto p8 = new Produto(8, "Compal 1L", 90 , 5);
		Produto p9 = new Produto(9, "Headphones", 900 , 7);
		Produto p10 = new Produto(10, "2M", 55 , 1200);
		
		OperacoesImplementacao op = new OperacoesImplementacao();
		
		Vector <Object> v = new Vector <Object> ();
		
		op.novoProduto(v, p1);
		op.novoProduto(v, p2);
		op.novoProduto(v, p3);
		op.novoProduto(v, p4);
		op.novoProduto(v, p5);
		op.novoProduto(v, p6);
		op.novoProduto(v, p7);
		op.novoProduto(v, p8);
		op.novoProduto(v, p9);
		op.novoProduto(v, p10);
		
		//System.out.println(v);
		
		System.out.println(op.qtdDisponivelPeloCodigo(v, 3));
		
		System.out.println(v.get(6));
		op.actualizarPrecoPeloCodigo(v, 90, 7);
		System.out.println(v.get(6));
		
		op.removerProdutoPeloCodigo(v, 10);
		String aux = "";
		for (int i = 0; i < v.size(); i++) {
			aux += v.get(i);
		}
		
		JOptionPane.showMessageDialog(null, aux);
		
		DefaultTableModel model = new DefaultTableModel();
        
        // Definir as colunas
        model.addColumn("Codigo Identificador");
        model.addColumn("Nome");
        model.addColumn("Preco");
        model.addColumn("Stock");
        
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
}
