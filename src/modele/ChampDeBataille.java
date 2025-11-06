package modele;

import java.util.ArrayList;
import java.util.List;

import donnee.Exportable;

public class ChampDeBataille implements Exportable{
	protected TERRAINS bataille;
	private List<Monstre> monstre = new ArrayList<Monstre>();
	private List<HeroDeBataille> heroes = new ArrayList<HeroDeBataille>();

	protected NomBataille nom = null;
	
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

	public void ajouterMonstre(Monstre monstre) {
		this.monstre.add(monstre);
	}
	
	public void ajouterHero(HeroDeBataille hero) {
		heroes.add(hero);
	}
	public NomBataille getNom() {
		return this.nom;
	}
	public void setNom(NomBataille nom) {
		this.nom = nom;
	}
	
	@Override
	public String exporterXML() {
		String xml = "";
		System.out.println("je me rend a la fonction");
		if(null != this.nom) xml += this.nom.exporterXML();
		System.out.println("je me rend au terrain");
		xml += "<terrain>"+bataille+"</terrain>";
		System.out.println("je me rend aux heroes");
		for(int i=0;i<heroes.size();i++) {
			xml += heroes.get(i).exporterXML();
		}
		System.out.println("je me rend aux monstres");
		for(int i = 0;i<monstre.size();i++) {
			xml += monstre.get(i).exporterXML();
		}
		System.out.println("<bataille>" + xml + "</bataille>");
		System.out.println("je me rend à la fin du string exportable");
		return "<bataille>" + xml + "</bataille>";
	}

	@Override
	public String exporterJSON() {
		return null;
	}

}
