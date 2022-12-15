package pradroesProjetoJava.strategy.outros.strategy2.comportamentos2;


import pradroesProjetoJava.strategy.outros.strategy2.comportamentos2.interfaces2.Comportamento2;
import pradroesProjetoJava.strategy.outros.strategy2.robo2.Robo2;

public class ComportamentoMoverEsquerda2 implements Comportamento2{

	@Override
	public void mover(Robo2 robo) {
		System.out.println(robo.nome + " esta se movendo para a ESQUERDA!");	
	}

	
}
