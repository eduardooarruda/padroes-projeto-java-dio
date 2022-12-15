package pradroesProjetoJava.strategy.outros.strategy2.robo2;

import pradroesProjetoJava.strategy.outros.strategy2.comportamentos2.interfaces2.Comportamento2;

public class Robo2 {
	public String nome;

	public Robo2(String nome) {
		this.nome = nome;
	}
	
	public void mover(Comportamento2 comportamento) {
		comportamento.mover(this);
	}
	
}
