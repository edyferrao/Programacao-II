package ficheiros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JOptionPane;

import produto.Produto;

public class FicheiroProdutos {
	
	public void gravar(Vector <Produto> v) throws IOException {
		try {
			FileOutputStream ficheiroProduto = new FileOutputStream("produto.dat");
			try (ObjectOutputStream obj = new ObjectOutputStream(ficheiroProduto)) {
				obj.writeObject(v);
				obj.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao gravar");
		}
	}
	
	public Vector <Produto> ler() {
		Vector <Produto> v = new Vector <Produto> ();
		try {
			FileInputStream ficheiroProduto = new FileInputStream("produto.dat");
			//JOptionPane.showMessageDialog(null, "kfjelirjep;");
			try (ObjectInputStream obj = new ObjectInputStream(ficheiroProduto)) {
				v = (Vector <Produto>) obj.readObject();
				//JOptionPane.showMessageDialog(null, "Ficheiro lido");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ficheiro não encontrado");
		}
		return v;
	}
}
