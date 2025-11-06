package modele;

import java.util.ArrayList;
import java.util.List;

import donnee.Exportable;

public class Champ implements Exportable{
	
	protected List<HeroDeBataille> hero = new ArrayList<HeroDeBataille>();
	protected List<Monstre> monstre = new ArrayList<Monstre>();
	protected ChampDeBataille bataille = null;

	@Override
	public String exporterXML() {

		return null;
	}

	@Override
	public String exporterJSON() {
		return null;
	}

}
