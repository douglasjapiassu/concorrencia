package hellothreads.aula3.conta;

public class Conta {

	private float saldo;
	public float getSaldo() {
		return saldo;
	}
	
	public Conta(float saldoInicial){
		saldo = saldoInicial;
	}
	
	public synchronized void depositar(float valor){
		float novoValor = this.saldo + valor;
		for (int i = 0; i < 100; i++) {
			System.out.print("");
		}
		this.saldo = novoValor;
	}
	
	public synchronized void render(float taxa){
		float saldoAtualizado = this.saldo * (1 + taxa);
		for (int i = 0; i < 100; i++) {
			System.out.print("");
		}
		this.saldo = saldoAtualizado;
	}
}
