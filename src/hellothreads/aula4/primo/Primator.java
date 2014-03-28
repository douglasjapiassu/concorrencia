package hellothreads.aula4.primo;

public class Primator implements Runnable {
	
	int numeroMenor;
	int numeroMaior;

	public Primator(int numeroMenor, int numeroMaior) {
		this.numeroMenor = numeroMenor;
		this.numeroMaior = numeroMaior;
	}

	@Override
	public void run() {
		for (int numeroVerificar = numeroMenor; numeroVerificar < numeroMaior; numeroVerificar++) {
			isNumeroPrimo(numeroVerificar);
		}
	}
	
	private static void isNumeroPrimo(int numeroVerificar) {
		int contador = 0;
		
		for (int i=1;i<=numeroVerificar;i++ ){
			if(numeroVerificar%i == 0)
				contador=contador+1;
		}
		
		if (contador==2)
			Concorrencia.numerosPrimos.add(numeroVerificar);
	}

}
