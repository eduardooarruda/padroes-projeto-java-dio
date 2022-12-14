package pradroesProjetoJava.strategy.dio;

import pradroesProjetoJava.strategy.dio.comportamentos.ComportamentoMoverDireita;
import pradroesProjetoJava.strategy.dio.comportamentos.ComportamentoMoverEsquerda;
import pradroesProjetoJava.strategy.dio.comportamentos.interfaces.Comportamento;
import pradroesProjetoJava.strategy.dio.robo.Robo;

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
