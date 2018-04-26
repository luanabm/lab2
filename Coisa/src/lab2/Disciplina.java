package lab2;

import java.util.Arrays;

/**
 * Representação de uma disciplina, ofertada, com construtores e métodos, para facilitar nos calculos de ações especificas.  
 * @author Luana Barbosa de Melo - 117210906
 *
 */
public class Disciplina {
	
	/**
	 * Nome da disciplina que será cadastrada.
	 */
    private String nomeDisciplina;
    
    /** 
     * Horas de estudos, na disciplina especifica.
     */
    private int horas;
    
    /**
     * Array para se armazenar as notas, nessa mesma disciplina.
     */
    private double[] valorNota;
    
    /**
     * Atributo criado para armazenar a média do aluno, na disciplina.
     */
    private double media;
    
    /**
     * Constrói um cadastro para a disciplina especifica, dada no parametro.
     * Além de construir o array que foi dado como atributo com tamanho fixo de 4 notas, dado como padrão. 
     * @param nomeDisciplina, nome da disciplina para se construir o cadastro.
     */
    public Disciplina(String nomeDisciplina) {
         this.nomeDisciplina = nomeDisciplina;
         this.valorNota = new double[4];
    }
   
    /**
     * Método de calcular as horas estudadas na disciplina, atualizando o atributo horas.
     * @param horas, recebe as horas estudadas na disciplina.
     */
    public void cadastraHoras(int horas) {
        this.horas += horas;
    }
    
    /**
     * Método de cadastrar as notas, da disciplina, com parametro nota e valor dessa nota especifica que é definda de 1 a 4. 
     * @param nota
     * @param valorNota
     */
    public void cadastraNota(int nota, double valorNota) {
    	this.valorNota[nota-1] = valorNota;
    }
   
    /**
     * Método que retorna um valor boleano definido a partir do calculo da média e comparação da mesma se é maior ou igual a média padrão que é 7.0.
     * @return
     */
    public boolean aprovado() {
    	double soma;
        soma = valorNota[0] + valorNota[1] + valorNota[2] + valorNota[3];
        this.media = soma/ 4.0;
        return (media >= 7.0);
    }
   
    /**
     * Retorna uma string com o nome da disciplina cadastrada, as horas estudadas em tal, mais o valor da média e o valor de cada nota.
     */
    public String toString() {
    	return this.nomeDisciplina + " " + this.horas + " " + this.media + " " + Arrays.toString(valorNota);
    
    }	

}
