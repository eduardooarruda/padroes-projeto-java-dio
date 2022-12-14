package pradroesProjetoJava.singleton.primeiraForma;

public class Main {

	public static void main(String[] args) {
		/*Como ele está trabalhando com a mesma classe, então quando 
		  quando eu pegar um assento outra pessoa não vai poder pegar o mesmo assento.	
		  Referência: https://youtu.be/4F54CdYDE10
		*/
		agendarAssento("1A");
		agendarAssento("1A");
	}
	
	private static void agendarAssento(String assento) {
		Aviao a = Aviao.getINSTANCE();
		System.out.println(a.adquiriAssento(assento));
	}
}
