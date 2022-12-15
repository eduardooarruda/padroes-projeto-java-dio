package pradroesProjetoJava.facade.dio.subsistemas;

public class CepApi {
	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Mossoro";
	}
	
	public String recuperarEstado(String cep) {
		return "RN";
	}
}
