package inter;

import java.util.Vector;

public interface Operacoes {
	
	public abstract void criar(Vector <?> v);
	public abstract void actualizar(Vector <?> v);
	public abstract void remover(Vector <?> v);
	public abstract void listar(Vector <?> v);
	public abstract void pesquisar(Vector <?> v);
}
