package hellothreads.aula4.primo;

import java.util.ArrayList;
import java.util.List;

public class Concorrencia {

	public static List<Integer> numerosPrimos = new ArrayList<Integer>();
	
	public Concorrencia() {
		
	}
	
	public List<Integer> getNumerosPrimos() {
		return numerosPrimos;
	}
	
	public void setNumerosPrimos(List<Integer> numerosPrimos) {
		Concorrencia.numerosPrimos = numerosPrimos;
	}

}
