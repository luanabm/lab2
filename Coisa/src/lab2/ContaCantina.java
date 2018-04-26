package lab2;

public class ContaCantina {
	
	private String nomeDaCantina;
	private int qtdItens;
	private int valorCentavos;
	
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.valorCentavos += valorCentavos;
	}
	
	public void pagaConta(int valorCentavos) {
		this.valorCentavos -= valorCentavos;
	}
	
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorCentavos;
	}
}
