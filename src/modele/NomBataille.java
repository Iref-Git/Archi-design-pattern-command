package modele;

import donnee.Exportable;

public class NomBataille implements Exportable{
	protected String nomBataille;
	
	public NomBataille() {
		super();
	}
	public NomBataille(String nomBataille) {
		super();
		this.nomBataille = nomBataille;
	}
	public void setNomBataille(String nomBataille) {
		this.nomBataille = nomBataille;
	}
	public String getNomBataille() {
		return nomBataille;
	}

	@Override
	public String exporterXML() {
		
		return "<nomBataille>" + this.nomBataille.toString() + "</nomBataille>";
	}

	@Override
	public String exporterJSON() {
		return null;
	}

}
