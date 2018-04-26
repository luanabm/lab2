package lab2;

/**
 * Representação de uma conta de laboratório,
 * 
 * @author Luana Barbosa de Melo - 117210906
 *
 */

public class ContaLaboratorio {

	/**
	 * nome do laboratio utilizado.
	 */
	private String nome;

	/**
	 * Cota é o limite de espaço disponibilizado no sistema.
	 */
	private int cota;

	/**
	 * Espaço ja utilizado no sistema, dado em megabytes.
	 */
	private int espaco;

	/**
	 * Constrói uma conta a partir do nome do laboratorio. A cota disponibilizada
	 * por padrão será de 2000 mbytes. O espaço é o que ja está sendo utilizado no
	 * sistema, inicializado como 0.
	 * 
	 * @param nome,
	 *            nome do laboratorio utilizado.
	 */
	public ContaLaboratorio(String nome) {
		this(nome, 2000);
		this.espaco = 0;
	}

	/**
	 * Constrói uma conta a partir do nome do laboratorio, e da cota. A cota sera
	 * disponibilizada em megabytes.
	 * 
	 * @param nome
	 * @param cota
	 */
	public ContaLaboratorio(String nome, int cota) {
		this.nome = nome;
		this.cota = cota;
		this.espaco = 0;
	}

	/**
	 * O método, recebe a quantidade de espaço consumido em megabytes, e atualiza a
	 * variável espaço.
	 * 
	 * @param mbytes,
	 *            quantidade de megabytes utilizado.
	 */
	public void consomeEspaco(int mbytes) {
		this.espaco += mbytes;
	}

	/**
	 * O método, libera uma quantidade de espaço no sistema em megabytes de acordo
	 * com o parametro dado. A variável espaço é atualizada de acordo com a
	 * quantidade de mbytes liberados.
	 * 
	 * @param mbytes,
	 *            quantidade de megabytes liberados.
	 */
	public void liberaEspaco(int mbytes) {
		this.espaco -= mbytes;
	}

	/**
	 * Método que compara o espaço consumido com a cota, vendo se o espaço consumido é maior ou igual a cota. 
	 * @return, retorna um valor boleano, variável de acordo com a comparação do
	 * espaço utilizado com a cota.
	 */
	public boolean atingiuCota() {
		return espaco >= cota;
	}
	
	
	/**
	 * Retorna uma string que representa o nome do laboratorio, o espaço consumido e o espaço disponível(cota).
	 */
	public String toString() {
		return this.nome + " " + this.espaco + "/" + this.cota;
	}

}
