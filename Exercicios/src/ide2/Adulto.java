package ide2;

/**
 * Classe Adulto com constutor da super classe : 3 pontos
 * M�todo desloca : 2 pontos 
 * @author 
 *
 */

public class Adulto extends Pessoa{

	public Adulto(int id, String nome, String sexo) {
		super(id, sexo, nome);
	}
	
	public String desloca()
	{
		return "Pessoa adulta anda";
	}

}
