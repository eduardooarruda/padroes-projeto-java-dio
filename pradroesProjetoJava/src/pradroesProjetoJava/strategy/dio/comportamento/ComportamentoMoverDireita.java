package pradroesProjetoJava.strategy.dio.comportamento;

import pradroesProjetoJava.strategy.dio.comportamento.intefarce.Comportamento;

public class ComportamentoMoverDireita implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se para a Direta!");
	}

	

}
