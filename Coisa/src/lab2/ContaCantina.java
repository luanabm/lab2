package lab2;


/**
 * Representação de uma conta de uma cantina, especificada por nome da Cantina, por a quantidade de itens consumidos e valor da conta. 
 * 
 * @author Luana Barbosa de Melo - 117210906
 *
 */

public class ContaCantina {
	
	
	/**
	 * Nome da cantina que será efetuado o registro.
	 */
	private String nomeDaCantina;
	/**
	 * Quantidade de itens consumidos na cantina.
	 */
	private int qtdItens;
	/**
	 * Valor da conta, inicializado por padrão em zero.
	 */
	private int valorCentavos;
	
	
	/**
	 * Constrói a conta da cantina a partir do nome.
	 * @param nomeDaCantina
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	
	/**
	 * Metódo de cadastrar a quantidade de itens consumidos e o valor total da conta.
	 * @param qtdItens
	 * @param valorCentavos
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.valorCentavos += valorCentavos;
	}
	
	/**
	 * Método descontar do valor total da conta o que foi quitado.
	 * @param valorCentavos
	 */
	public void pagaConta(int valorCentavos) {
		this.valorCentavos -= valorCentavos;
	}
	
	/**
	 * Retorna uma string com o nome da Cantina cadastrada, a quantidade de itens consumidos em tal, e o valor atualizado da conta.
	 */
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorCentavos;
	}
}
