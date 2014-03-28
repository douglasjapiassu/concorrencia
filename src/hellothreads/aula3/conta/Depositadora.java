package hellothreads.aula3.conta;

public class Depositadora implements Runnable {

	Conta conta;
	float valor;
	
	public Depositadora(Conta conta, float valor) {
		this.conta = conta;
		this.valor = valor;
	}
	
	@Override
	public void run() {
		conta.depositar(valor);
	}

}
