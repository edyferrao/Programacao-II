package cliente;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ficheiros.FicheiroCliente;



public final class Operacoes_Cliente {
	
	FicheiroCliente fc = new FicheiroCliente();
	
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public void gravarC(Vector <Cliente> v) {
		try {
			fc.gravar(v);
			JOptionPane.showMessageDialog(null,"Cliente registrado com sucesso");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void criar(Vector <Cliente> v) {
		int novoId = Integer.parseInt(JOptionPane.showInputDialog("Insira o id do cliente"));
		String novoNome = JOptionPane.showInputDialog("Insira o nome do Cliente");
		if (v.isEmpty()) {
			Cliente c = new Cliente(novoId, novoNome, 0);
			v.add(c);
			gravarC(v);
		}
		else {
			int control = 0;
			for (int i = 0; i < v.size(); i++) {
				if (((Cliente)v.get(i)).getNome().equalsIgnoreCase(novoNome) || ((Cliente)v.get(i)).getId() == novoId) {
					JOptionPane.showMessageDialog(null, "O nome ou id do cliente já existe", "Erro", ERROR_MESSAGE );
					control = 1;
				}
			}
			if (control == 0) {
				Cliente c = new Cliente(novoId, novoNome, 0);
				v.add(c);
				gravarC(v);
			}
		}
	}
	
	public void actualizar(Vector <Cliente> v) {
		int control = 0;
		if (v.isEmpty()) {
			control = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Cliente Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String escolha = JOptionPane.showInputDialog("Insira o nome ou id do cliente");
			for (int i = 0; i < v.size(); i++) {
				if (((Cliente)v.get(i)).getNome().equalsIgnoreCase(escolha) || ((Cliente)v.get(i)).getId() == Integer.parseInt(escolha)) {
					control = 1;
					int idEdit = Integer.parseInt(JOptionPane.showInputDialog("Deseja actualizar?\n1-id\n2-nome"));
					if (idEdit == 1) {
						int novoId = Integer.parseInt(JOptionPane.showInputDialog("Insira o novo id do cliente"));
						((Cliente)v.get(i)).setId(novoId);
						JOptionPane.showMessageDialog(null,"Id editado com sucesso");
						gravarC(v);
					}
					else if (idEdit == 2) {
						String novoNome = JOptionPane.showInputDialog("Insira o novo nome do Cliente");
						((Cliente)v.get(i)).setNome(novoNome);
						JOptionPane.showMessageDialog(null,"Nome editado com sucesso");
						gravarC(v);
					}
				}
			}
			if (control == 0) {
				JOptionPane.showMessageDialog(null, "Cliente nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}

	public void remover(Vector <Cliente> v) {
		int control = 0;
		if (v.isEmpty()) {
			control = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Cliente Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String escolha = JOptionPane.showInputDialog("Insira o nome ou id");
			for (int i = 0; i < v.size(); i++) {
				if (((Cliente)v.get(i)).getNome().equalsIgnoreCase(escolha) || ((Cliente)v.get(i)).getId() == Integer.parseInt(escolha)) {
					control = 1;
					int resposta =JOptionPane.showConfirmDialog(null, "Tem a certeza que ser remover?");
					if (resposta == JOptionPane.YES_OPTION) {
						v.remove(i);
						JOptionPane.showMessageDialog(null,"Cliente removido com sucesso");
						gravarC(v);
					}
					else if (resposta == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null,"Operacao cancelada");
					}
				}
			}
			if (control == 0) {
				JOptionPane.showMessageDialog(null, "Cliente nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}
	
	public void listar(Vector <Cliente> v) {
		DefaultTableModel model = new DefaultTableModel();
		Vector <Object> temporario = new Vector <Object> ();
		
		for (int i = 0; i < v.size(); i++) {
			temporario.add(v.get(i));
		}
        // Definir as colunas
        model.addColumn("Codigo Identificador");
        model.addColumn("Nome");
        model.addColumn("Conta do Cliente");
        
        // Adicionar dados ao modelo
        for (int i = 0; i < v.size(); i++) {
        	model.addRow(new Object[]{((Cliente)temporario.get(i)).getId(), ((Cliente)temporario.get(i)).getNome(), ((Cliente)temporario.get(i)).getConta()});
		}
        // Criar a tabela
        JTable table = new JTable(model);
        
        // Criar o painel de rolagem
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Exibir a tabela no JOptionPane
        JOptionPane.showMessageDialog(null, scrollPane, "Tabela de Objetos", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void pesquisar(Vector <Cliente> v) {
		int control =0;
		if (v.isEmpty()) {
			control = 1;
			JOptionPane.showMessageDialog(null, "Nenhum Cliente Registrado", "Erro", ERROR_MESSAGE );
		}
		else {
			String localizarCliente = JOptionPane.showInputDialog("Insira o nome ou id do cliente");
			for (int i = 0; i < v.size(); i++) {
				if (((Cliente)v.get(i)).getNome().equalsIgnoreCase(localizarCliente) || ((Cliente)v.get(i)).getId() == Integer.parseInt(localizarCliente)) {
					control = 1;
					JOptionPane.showMessageDialog(null, v.get(i));
				}
			}
			if (control == 0) {
				JOptionPane.showMessageDialog(null, "Cliente nao encontrado", "Erro", ERROR_MESSAGE );
			}
		}
	}
}
	
	