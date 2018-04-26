package lab2;

public class Saude {
	
	private String saudeMental;
	private String saudeFisica;
	private String statusGeral;
	
	
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
		this.statusGeral = "boa";
	}

	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
		this.avaliaSaude();
	}
	
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
		this.avaliaSaude();
	}
	
	private void avaliaSaude() {
		if (saudeMental.equals(saudeFisica)) {
			this.statusGeral = saudeMental;
		}
		else {
			this.statusGeral = "ok";
		}
	
		
	}
	public String getStatusGeral() {
		return this.statusGeral;
		
	}
}
