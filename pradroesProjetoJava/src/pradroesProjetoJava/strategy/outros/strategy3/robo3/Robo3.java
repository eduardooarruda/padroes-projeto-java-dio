package pradroesProjetoJava.strategy.outros.strategy3.robo3;

import pradroesProjetoJava.strategy.outros.strategy3.comportamento3.interfaces3.Comportamento3;
import pradroesProjetoJava.strategy.outros.strategy3.robo3.interfaces3.NomeRobo3;

public class Robo3 implements NomeRobo3{
	private String nome;
	
	public Robo3(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
	public void moverRobo(Comportamento3 comportamento) {
		comportamento.mover(this);
	}
	
}
