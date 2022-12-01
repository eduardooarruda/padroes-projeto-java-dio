/*
 O padrão singleton é usado quando só pode ter uma instância
 de uma mesma classe. 
  
*/

package pradroesProjetoJava.singleton.primeiraForma;

import java.util.Set;
import java.util.HashSet;

//EAGER INITIALIZATION
public class Aviao {
	private static final Aviao INSTANCE = new Aviao();
	private Set<String> assentosDisponiveis;
	
	
	private Aviao() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
	}
	
	public static Aviao getINSTANCE() {
		return INSTANCE;
	}
	
	public boolean listaAssentosDisponiveis(String assento) {
		return assentosDisponiveis.remove(assento);
	}
	
}
