package lab2;

import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private int horas;
    private double[] valorNota;
    private double media;
   
    public Disciplina(String nomeDisciplina) {
         this.nomeDisciplina = nomeDisciplina;
         this.valorNota = new double[4];
    }
   
    public void cadastraHoras(int horas) {
        this.horas += horas;
    }
   
    public void cadastraNota(int nota, double valorNota) {
    	this.valorNota[nota-1] = valorNota;
    }
   
    public boolean aprovado() {
    	double soma;
        soma = valorNota[0] + valorNota[1] + valorNota[2] + valorNota[3];
        this.media = soma/ 4.0;
        return (media >= 7.0);
    }
   
    public String toString() {
    	return this.nomeDisciplina + " " + this.horas + " " + this.media + " " + Arrays.toString(valorNota);
    
    }	

}
