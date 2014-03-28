package hellothreads.aula3;

import hellothreads.aula3.conta.AtualizadorDePoupanca;
import hellothreads.aula3.conta.Conta;
import hellothreads.aula3.conta.Depositadora;


public class MainAula3 {

	public static void main(String[] args) {
		/*Exercicio1 rotina = new Exercicio1();
		Thread thread = new Thread(rotina);
		
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Programa Finalizado!");*/
		
		/*Exercicio2 impressoraDeFrutas = new Exercicio2();
		Thread executor = new Thread(impressoraDeFrutas);
		
		executor.start();*/
		
		/*Conta conta = new Conta(100);
		Depositadora depositadora = new Depositadora(conta, 1000);
		AtualizadorDePoupanca atualizadorDePoupanca = new AtualizadorDePoupanca(conta);
		Thread adicao = new Thread(depositadora);
		Thread atualizacao = new Thread(atualizadorDePoupanca);
		
		adicao.start();
		atualizacao.start();
		
		try {
			adicao.join();
			atualizacao.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());*/
		
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("Iniciou a contagem");
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			System.out.println("O total é " + b.total);
		}
		
		
	}
}

class ThreadB extends Thread{
	int total;
	@Override
	public void run(){
		for (int i = 0; i < 200; i++) {
			total += i;
		}
		
		notify();
	}
}


