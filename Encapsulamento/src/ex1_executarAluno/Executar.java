package ex1_executarAluno;

import ex1_aluno.Aluno;

public class Executar {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Edilson");
		aluno.setIdade(23);
		aluno.setMatricula(3814);
		
		aluno.situacao();
		
		
	}

}
