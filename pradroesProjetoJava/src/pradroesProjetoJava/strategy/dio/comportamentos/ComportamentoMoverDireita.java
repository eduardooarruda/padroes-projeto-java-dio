package pradroesProjetoJava.strategy.dio.comportamentos;

import pradroesProjetoJava.strategy.dio.comportamentos.interfaces.Comportamento;

public class ComportamentoMoverDireita implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se para a Direta!");
	}

	

}
