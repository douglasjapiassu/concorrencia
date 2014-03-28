package hellothreads.aula4;

import hellothreads.aula4.primo.Concorrencia;
import hellothreads.aula4.primo.Primator;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
		
		Thread thread1 = new Thread(new Primator(0, 10000));
		Thread thread2 = new Thread(new Primator(10001, 20000));
		Thread thread3 = new Thread(new Primator(20001, 30000));
		Thread thread4 = new Thread(new Primator(30001, 40000));
		Thread thread5 = new Thread(new Primator(40001, 50000));
		Thread thread6 = new Thread(new Primator(50001, 60000));
		Thread thread7 = new Thread(new Primator(60001, 70000));
		Thread thread8 = new Thread(new Primator(70001, 80000));
		Thread thread9 = new Thread(new Primator(80001, 90000));
		Thread thread10 = new Thread(new Primator(90001, 99999));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			thread6.join();
			thread7.join();
			thread8.join();
			thread9.join();
			thread10.join();
		} catch (InterruptedException e) {
			System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(Concorrencia.numerosPrimos);
		
		long tempoFinal = System.currentTimeMillis();
		
		System.out.println("Tempo de execução:");
		System.out.println((tempoFinal - tempoInicial)/1000);
		
	}
	
	@SuppressWarnings("unused")
	private static void imprimeNumeroPrimo(){
		for (int numeroVerificar = 0; numeroVerificar < 99999; numeroVerificar++) {
			isNumeroPrimo(numeroVerificar);
		}
	}
	
	private static Boolean isNumeroPrimo(int numeroVerificar) {
		int contador = 0;
		
		for (int i=1;i<=numeroVerificar;i++ ){
			if(numeroVerificar%i == 0)
				contador=contador+1;
		}
		
		if (contador==2)
			System.out.println(numeroVerificar);
		
		return false;
	}

}