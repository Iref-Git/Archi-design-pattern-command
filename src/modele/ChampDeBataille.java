package modele;

import donnee.Exportable;

public class ChampDeBataille implements Exportable{
	protected TERRAINS bataille;
	
	public ChampDeBataille(TERRAINS bataille) {
		super();
		this.bataille = bataille;
	}
	public TERRAINS getBataille() {
		return bataille;
	}
	public void setBataille(TERRAINS bataille) {
		this.bataille = bataille;
	}

	@Override
	public String exporterXML() {

		return "<bataille>" + this.bataille.toString() + "</bataille>";
	}

	@Override
	public String exporterJSON() {
		return null;
	}

}
