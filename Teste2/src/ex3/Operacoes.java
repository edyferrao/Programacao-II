package ex3;

import java.util.Vector;

public interface Operacoes {
	
	public abstract void novoProduto(Vector <Object> v, Produto p);
	public abstract int qtdDisponivelPeloCodigo(Vector <Object> v, int id);
	public abstract void actualizarPrecoPeloCodigo(Vector <Object> v, double preco ,int id);
	public abstract void removerProdutoPeloCodigo(Vector <Object> v, int id);
}
