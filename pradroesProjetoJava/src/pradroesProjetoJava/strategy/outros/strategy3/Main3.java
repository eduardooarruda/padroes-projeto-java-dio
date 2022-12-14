package pradroesProjetoJava.strategy.outros.strategy3;

import pradroesProjetoJava.strategy.outros.strategy3.comportamento3.ComportamentoMoverDireita3;
import pradroesProjetoJava.strategy.outros.strategy3.comportamento3.ComportamentoMoverEsquerda3;
import pradroesProjetoJava.strategy.outros.strategy3.comportamento3.interfaces3.Comportamento3;
import pradroesProjetoJava.strategy.outros.strategy3.robo3.Robo3;

public class Main3 {
	public static void main(String[] args) {
		Robo3 robo = new Robo3("WALL-E");
		
		Comportamento3 moverDireita = new ComportamentoMoverDireita3();
		Comportamento3 moverEsquerda = new ComportamentoMoverEsquerda3();
		
		robo.moverRobo(moverDireita);
		robo.moverRobo(moverDireita);
		robo.moverRobo(moverDireita);
		robo.moverRobo(moverEsquerda);
		robo.moverRobo(moverEsquerda);
		robo.moverRobo(moverEsquerda);
	}
}
