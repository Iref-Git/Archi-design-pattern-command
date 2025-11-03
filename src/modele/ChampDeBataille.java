package modele;

import java.util.ArrayList;
import java.util.List;

import donnee.Exportable;

public class ChampDeBataille implements Exportable{
	protected TERRAINS bataille;
	protected List<HeroDeBataille> heroes = new ArrayList<HeroDeBataille>();
	protected List<Monstre> monstres = new ArrayList<Monstre>();
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
	
	public void ajouterHero(HeroDeBataille hero) {
		heroes.add(hero);
	}
	
	public void ajouterMonstre(Monstre monstre) {
		monstres.add(monstre);
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
