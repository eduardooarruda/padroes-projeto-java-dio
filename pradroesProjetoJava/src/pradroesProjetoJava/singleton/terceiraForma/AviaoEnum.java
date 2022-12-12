package pradroesProjetoJava.singleton.terceiraForma;

import java.util.HashSet;
import java.util.Set;

public enum AviaoEnum {
	
	INSTANCE;
	
	private Set<String> assentosDisponiveis;
	
	AviaoEnum(){
		this.assentosDisponiveis = new HashSet<>();
		this.assentosDisponiveis.add("1A");
		this.assentosDisponiveis.add("1B");
	}
	
	public boolean adquirirAssento(String assento) {
		return this.assentosDisponiveis.remove(assento);
	}
	
	public static void agendarAssento(String assento) {
		AviaoEnum aviao = AviaoEnum.INSTANCE;
		System.out.println(aviao.adquirirAssento(assento));
	}
}
