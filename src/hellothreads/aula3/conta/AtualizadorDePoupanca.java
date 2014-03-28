package hellothreads.aula3.conta;

public class AtualizadorDePoupanca implements Runnable {

	Conta conta;
	private final float taxa = 0.01f;
	
	public AtualizadorDePoupanca(Conta conta) {
		this.conta = conta;
	}
	
	@Override
	public void run() {
		conta.render(taxa);
	}

}
