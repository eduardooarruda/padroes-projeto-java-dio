package pradroesProjetoJava.strategy.dio.robo;

import pradroesProjetoJava.strategy.dio.comportamentos.interfaces.Comportamento;

public class Robo {

	private Comportamento comportamento;
	
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		this.comportamento.mover();
	}
}
