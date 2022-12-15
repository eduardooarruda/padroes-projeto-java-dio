package pradroesProjetoJava.strategy.outros.strategy2;

/*
  Os códigos das pasta denorminda 'Outros' tem como base a aula do professor Reinaldo no YouTube: 
  https://youtu.be/jInj68kINGE
 */
import pradroesProjetoJava.strategy.outros.strategy2.comportamentos2.ComportamentoMoverDireita2;
import pradroesProjetoJava.strategy.outros.strategy2.comportamentos2.ComportamentoMoverEsquerda2;
import pradroesProjetoJava.strategy.outros.strategy2.comportamentos2.interfaces2.Comportamento2;
import pradroesProjetoJava.strategy.outros.strategy2.robo2.Robo2;

public class Main2 {

	public static void main(String[] args) {
		Robo2 robo = new Robo2("WALL-E");
		Comportamento2 moverDireita = new ComportamentoMoverDireita2();
		Comportamento2 moverEsquerda = new ComportamentoMoverEsquerda2();
		
		robo.mover(moverDireita);
		robo.mover(moverDireita);
		robo.mover(moverDireita);
		robo.mover(moverEsquerda);
		robo.mover(moverEsquerda);
		robo.mover(moverEsquerda);
		
	}

}
