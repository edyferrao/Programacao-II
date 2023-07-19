package aluno;

import java.util.Vector;

import javax.swing.JOptionPane;

public class TestarAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Edilson", 1, "LECC21");
		Aluno aluno2 = new Aluno("Ferrão", 2, "LECC11");
		Aluno aluno3 = new Aluno("Eddie", 5, "LECC31");
		
		Vector <Aluno> v = new Vector <Aluno>();
		
		v.add(aluno1);
		v.add(aluno2);
		JOptionPane.showMessageDialog(null, v.get(0).getNome());
		JOptionPane.showMessageDialog(null, v);
		v.add(1, aluno3);
		JOptionPane.showMessageDialog(null, v);
		v.removeElementAt(0);
		JOptionPane.showMessageDialog(null, v);
		
	}

}
