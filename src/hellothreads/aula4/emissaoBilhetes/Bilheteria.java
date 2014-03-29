package hellothreads.aula4.emissaoBilhetes;

import java.util.ArrayList;
import java.util.List;

public class Bilheteria{ 
	
	List<Bilhete> listaDeBilhetes = new ArrayList<Bilhete>();
	
	public synchronized boolean fornecerBilhete(String nomeComprador){
		int numeroBilheteVendido = 0;
		if(listaDeBilhetes.size() == 0) { 
			System.out.println("Sem Bilhetes - " + nomeComprador);
		} else {
			System.out.println(nomeComprador + " comprou o bilhete " + listaDeBilhetes.get(0).getNumeroBilhete());
			
			numeroBilheteVendido = listaDeBilhetes.remove(0).getNumeroBilhete();
		}
		
		return numeroBilheteVendido == 20;
	} 

	public synchronized void recebeBilhete(int numBilhete) { 
		listaDeBilhetes.add(new Bilhete(numBilhete)); 
		System.out.println("Bilhete " + numBilhete + " emitido."); 
	} 
} 
