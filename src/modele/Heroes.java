package modele;

import java.util.ArrayList;
import java.util.List;

import donnee.Exportable;

public class Heroes implements Exportable {
	
	protected List<HeroDeBataille> heroes = new ArrayList<HeroDeBataille>();
	protected ChampDeBataille bataille = null;
	protected NomBataille nom = null;
	
	public Heroes() {
		
	}
	public List<HeroDeBataille> getHero(){
		return heroes;
	}
	public void SetHeroes(List<HeroDeBataille> heroes) {
		this.heroes = heroes;
		
	}
	public ChampDeBataille getBataille() {
		return bataille;
	}
	public void setBataille(ChampDeBataille bataille) {
		this.bataille = bataille;
	}
	public void setNomChoisie(NomBataille nom) {
		this.nom = nom;
	}
	public NomBataille getNomChoisie() {
		return nom;
	}

	@Override
	public String exporterXML() {
		String xml = "";
		if(null != this.bataille) xml+=this.bataille.exporterXML();
		if(null != this.nom) xml += this.nom.exporterXML();
		for(HeroDeBataille hero : this.heroes) {
			xml += hero.exporterXML();
		}
		return "<bataille>" + xml + "</bataille>";
	}

	@Override
	public String exporterJSON() {
		return null;
	}

}
