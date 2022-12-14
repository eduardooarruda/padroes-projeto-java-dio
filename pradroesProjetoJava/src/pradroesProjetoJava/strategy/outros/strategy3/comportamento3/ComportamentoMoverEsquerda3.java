package pradroesProjetoJava.strategy.outros.strategy3.comportamento3;

import pradroesProjetoJava.strategy.outros.strategy3.comportamento3.interfaces3.Comportamento3;
import pradroesProjetoJava.strategy.outros.strategy3.robo3.interfaces3.NomeRobo3;

public class ComportamentoMoverEsquerda3 implements Comportamento3{

	@Override
	public void mover(NomeRobo3 nomeRobo) {
		System.out.println(nomeRobo.getNome() + " esta se movendo para a ESQUERDA!");
	}

}
