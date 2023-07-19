package ex3;

import java.util.Vector;

public class OperacoesImplementacao implements Operacoes {
		
	@Override
	public void novoProduto(Vector <Object> v, Produto p) {
		v.add(p);
		
	}

	@Override
	public int qtdDisponivelPeloCodigo(Vector<Object> v, int id) {
		for (int i = 0; i < v.size(); i++) {
			if (id == ((Produto)v.get(i)).getCod_id()) {
				return ((Produto)v.get(i)).getQtd_stock();
			}
		}
		return -1;
	}

	@Override
	public void actualizarPrecoPeloCodigo(Vector<Object> v, double preco ,int id) {
		for (int i = 0; i < v.size(); i++) {
			if (id == ((Produto)v.get(i)).getCod_id()) {
				((Produto)v.get(i)).setPreco(preco);
			}
		}
		
	}

	@Override
	public void removerProdutoPeloCodigo(Vector<Object> v, int id) {
		for (int i = 0; i < v.size(); i++) {
			if (id == ((Produto)v.get(i)).getCod_id()) {
				v.remove(i);
			}
		}
		
	}

}
