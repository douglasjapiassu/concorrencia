package hellothreads.aula3;


public class Exercicio2 implements Runnable {

	@Override
	public void run() {
		String frutas[] = {"Banana",
				"Tomate",
				"Maçã",
				"Laranja",
				"Piqui"};
		
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		
		imprimeFrutas(frutas);
	}

	private void imprimeFrutas(String[] frutas) {
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
