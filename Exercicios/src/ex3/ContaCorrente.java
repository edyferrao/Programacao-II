package ex3;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

import javax.swing.JOptionPane;

public final class ContaCorrente extends Conta {

	public ContaCorrente(String titular) {
		super(titular);
	}

	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
		JOptionPane.showMessageDialog(null, "Depositou com  sucesso o valor de: " + valor + " na sua conta, o seu novo saldo é de: " + getSaldo());
	}

	@Override
	public boolean sacar(double valor) {
		if (valor > getSaldo()) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Erro", ERROR_MESSAGE);
			return false;
		} else {
			setSaldo(getSaldo() - valor - (valor * 5 / 100));
			JOptionPane.showMessageDialog(null, "Levou com sucesso o valor de: " + valor + ", o seu novo saldo é de: " + getSaldo());
			return true;
		}
	}
}
