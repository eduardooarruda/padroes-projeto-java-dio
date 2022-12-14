package pradroesProjetoJava.strategy.outros.strategy2.robo2;

import pradroesProjetoJava.strategy.outros.strategy2.comportamentos2.interfaces2.Comportamento2;

public class Robo {
	public String nome;

	public Robo(String nome) {
		this.nome = nome;
	}
	
	public void mover(Comportamento2 comportamento) {
		comportamento.mover(this);
	}
	
}
