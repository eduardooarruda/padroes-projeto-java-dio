package pradroesProjetoJava.strategy.dio;

import pradroesProjetoJava.strategy.dio.Robo.Robo;
import pradroesProjetoJava.strategy.dio.comportamento.ComportamentoMoverDireita;
import pradroesProjetoJava.strategy.dio.comportamento.ComportamentoMoverEsquerda;
import pradroesProjetoJava.strategy.dio.comportamento.intefarce.Comportamento;

public class Main {

	public static void main(String[] args) {
	
		Comportamento moverDireita = new ComportamentoMoverDireita();
		Comportamento moverEsquerda = new ComportamentoMoverEsquerda();
		
		Robo robo = new Robo();
		robo.setComportamento(moverDireita);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(moverEsquerda);
		robo.mover();
		robo.mover();
		robo.mover();
	}

}
