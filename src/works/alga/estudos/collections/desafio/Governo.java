package works.alga.estudos.collections.desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {

	// armazena uma lista de politicos por estado da federação
	private Map<String, List<Politico>> partidosPoliticos;
	/*
	 * chave do tipo string e valor do tipo list. na chave do mapa deve-se atribuir
	 * a sigla do partido. no valor, atribui-se um objeto do tipo list, como por
	 * exemplo um arraylist
	 */

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
		/*
		 * instanciacao do hash de partidospoliticos da linha 12 apesar de parecer
		 * estranho estar dentro do construtor da classe governo, isso eh sim uma boa
		 * pratica
		 */
	}

	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de politicos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		// se nao existir uma lista de politicos para o partido informado
		// devemos instanciar uma nova lista (pois eh a primeira inclusao neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}

		// adiciona o politico recebido como parametro a lista de politicos
		politicos.add(politico);

		// adiciona a lista de politicos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);

	}

	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de politicos para o partido informado (por partido e cargo)
		// e cálculo dos salários
		double d = 0;
		for (Politico p : partidosPoliticos.get(partidoPolitico)) {
			d += p.getCargo().getSalario().doubleValue();
		}
		BigDecimal somaSalarios = new BigDecimal(d);
		return somaSalarios;
	}

	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos politicos para o partido e cargo informados
		// e calculo dos salarios
		double b = 0;
		for (Politico p : partidosPoliticos.get(partidoPolitico)) {
			if (p.getCargo().equals(cargo)) {
				b += p.getCargo().getSalario().doubleValue();
			}
		}
		BigDecimal somaSalariosParaCargo = new BigDecimal(b);
		return somaSalariosParaCargo;
	}

	public static void buscaPoliticosPorPartidoeCargo() {

	}

	public Map<String, List<Politico>> getPartidosPoliticos() {
		return partidosPoliticos;
	}

	public void setPartidosPoliticos(Map<String, List<Politico>> partidosPoliticos) {
		this.partidosPoliticos = partidosPoliticos;
	}

}
