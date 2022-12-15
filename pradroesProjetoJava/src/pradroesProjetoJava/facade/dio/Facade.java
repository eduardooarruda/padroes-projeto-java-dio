package pradroesProjetoJava.facade.dio;

import pradroesProjetoJava.facade.dio.subsistemas.CepApi;
import pradroesProjetoJava.facade.dio.subsistemas.CrmService;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
