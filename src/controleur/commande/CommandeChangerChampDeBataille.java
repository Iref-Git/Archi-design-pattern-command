package controleur.commande;

import modele.Champ;
import modele.ChampDeBataille;
import modele.TERRAINS;
import vue.VueWesnothForBattle;

public class CommandeChangerChampDeBataille extends Commande {

	protected ChampDeBataille champDeBataille;
	protected TERRAINS ancienTerrain;
	protected TERRAINS terrain;
	
	
	public CommandeChangerChampDeBataille(ChampDeBataille champ, TERRAINS terrain) {
		super();
		this.ancienTerrain = champ.getBataille();
		this.champDeBataille = champ;
		this.terrain = terrain;
	}

	@Override
	public void executer() {
		System.out.println("Ancien Champ de bataille:"+ancienTerrain+"\n Nouveau Terrain:"+terrain);
		champDeBataille.setBataille(terrain);
		VueWesnothForBattle.getInstance().afficherBataille(terrain);
		
	}

	@Override
	public void annuler() {
		System.out.println("Ancien Champ de bataille:"+ancienTerrain);
		VueWesnothForBattle.getInstance().afficherBataille(ancienTerrain);
		
	}

}
