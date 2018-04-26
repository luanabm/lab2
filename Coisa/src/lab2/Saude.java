package lab2;

/**
 * Representação da saúde de um aluno. Sendo a sua saúde física e mental e retornando seu status geral.
 * @author Luana Barbosa de Melo - 117210906
 *
 */
public class Saude {
	
	/** Atributo da saúde mental do aluno.
	 */
	private String saudeMental;
	
	/**
	 * Atributo da saúde física do aluno.
	 */
	private String saudeFisica;
	
	/**
	 * Atributo do status geral do aluno.
	 */
	private String statusGeral;
	
	/**
	 * Constrói um status geral do aluno, inicializado como "boa", usando como referencia a saude física e mental inicializados como bons tambem.
	 */
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
		this.statusGeral = "boa";
	}
	
	/**
	 * Atualiaza a saúde mental do aluno, a partir do parametro valor.
	 * @param valor, string que receberar "boa" ou "fraca", para representar a saúde metal do aluno.
	 */
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
		this.avaliaSaude();
	}
	
	/**
	 * Atualiaza a saúde física do aluno, a partir do parametro valor.
	 * @param valor, string que receberar "boa" ou "fraca", para representar a saúde física do aluno.
	 */
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
		this.avaliaSaude();
	}
	
	/**
	 * Avalia a saúde mental e fisica, comparando-as e a partir disso determina o status geral do aluno.
	 */
	private void avaliaSaude() {
		if (saudeMental.equals(saudeFisica)) {
			this.statusGeral = saudeMental;
		}
		else {
			this.statusGeral = "ok";
		}
	
		
	}
	
	/** 
	 * Retorna a string com o status geral do aluno.
	 * @return
	 */
	public String getStatusGeral() {
		return this.statusGeral;
		
	}
}
