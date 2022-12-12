package pradroesProjetoJava.strategy.dio.Robo;

import pradroesProjetoJava.strategy.dio.comportamento.intefarce.Comportamento;

public class Robo {

	private Comportamento comportamento;
	
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		this.comportamento.mover();
	}
}
