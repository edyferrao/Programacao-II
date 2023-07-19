package ficheiros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import cliente.Cliente;

public class FicheiroCliente {
	
	public void gravar(Vector <Cliente> v) throws IOException {
		try {
			FileOutputStream ficheiroCliente = new FileOutputStream("cliente.dat");
			try (ObjectOutputStream obj = new ObjectOutputStream(ficheiroCliente)) {
				obj.writeObject(v);
				obj.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao gravar");
		}
	}
	
	public Vector <Cliente> ler() {
		Vector <Cliente> v = new Vector <Cliente> ();
		try {
			FileInputStream ficheiroCliente = new FileInputStream("cliente.dat");
			//JOptionPane.showMessageDialog(null, "kfjelirjep;");
			try (ObjectInputStream obj = new ObjectInputStream(ficheiroCliente)) {
				v = (Vector <Cliente>) obj.readObject();
				//JOptionPane.showMessageDialog(null, "Ficheiro lido");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ficheiro não encontrado");
		}
		return v;
	}
}
