package hellothreads.aula4.emissaoBilhetes;

public class Comprador extends Thread { 
	
	private Bilheteria bilheteria; 
	private boolean isBilhetesComprados;
	private String nomeComprador;

	public Comprador(Bilheteria bilheteria,String nomeComprador){ 
		this.nomeComprador = nomeComprador; 
		this.bilheteria = bilheteria; 
		this.isBilhetesComprados = false; 
	} 

	public void run(){ 
		while(!isBilhetesComprados) { 
			try{ 
				Thread.sleep(1000); 
			} 
			catch(InterruptedException e){
				System.err.println("Ocorreu o seguinte erro: " + e.getMessage());
				e.printStackTrace(); 
			}
			
			isBilhetesComprados = bilheteria.fornecerBilhete(nomeComprador); 
		} 
		
		System.out.println("Bilhetes esgotados."); 
	} 
}
