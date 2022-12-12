/*
 O padrão singleton é usado quando só pode ter uma instância
 de uma mesma classe. 
  
*/

package pradroesProjetoJava.singleton.segundaForma;

import java.util.Set;
import java.util.HashSet;

public class Aviao {
	private static Aviao instance;
	private Set<String> assentosDisponiveis;
	
	
	private Aviao() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
	}
	
	public static Aviao getInstance() {
		if(instance == null) {
			instance = new Aviao();
		}
		return instance;
	}
	
	public boolean adquirirAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}
	
}
