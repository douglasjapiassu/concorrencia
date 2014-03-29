package hellothreads.aula4.emissaoBilhetes;

public class Distribuidor extends Thread{ 

	private Bilheteria bilheteria; 

	public Distribuidor(Bilheteria bilheteria){ 
		this.bilheteria = bilheteria; 
	} 

	public void run(){ 
		for(int numeroBilhete=1;numeroBilhete<=20;numeroBilhete++){ 
			try{ 
				Thread.sleep(1500); 
			} 
			catch(InterruptedException e){ 
				System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
				e.printStackTrace();
			}
			
			//
			bilheteria.recebeBilhete(numeroBilhete); 
		}
	} 
} 