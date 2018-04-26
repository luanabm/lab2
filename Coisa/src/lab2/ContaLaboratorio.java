package lab2;

/**
 * Representação de uma conta de laboratório, 
 * @author Luana Barbosa de Melo - 117210906
 *
 */


public class ContaLaboratorio {

    private String nome;
    
    /**
     * Cota é o limite de espaço disponibilizado no sistema.
     */
    private int cota;
    
    /**
     * Espaço ja utilizado no sistema.
     */
    private int espaco;
    
    
    /**
     * Constrói uma conta a partir do nome do laboratorio.
     * A cota disponibilizada por padrão será de 2000.
     * O espaço é o que ja está sendo utilizado no sistema, inicializado como 0.
     * @param nome, nome do laboratorio utilizado.
     */
    public ContaLaboratorio(String nome) {
        this(nome,2000);
        this.espaco = 0;
    }
    /**
     * 
     * @param nome
     * @param cota
     */
    public ContaLaboratorio(String nome, int cota ) {
        this.nome = nome;
        this.cota = cota;
        this.espaco = 0;
    }
    public void consomeEspaco(int mbytes) {
        this.espaco += mbytes;
    }
    public void liberaEspaco(int mbytes) {
        this.espaco -= mbytes;
    }
    public boolean atingiuCota() {
        return espaco >= cota;
    }
    public String toString() {
        return this.nome + " " + this.espaco + "/" + this.cota;
    }

}
