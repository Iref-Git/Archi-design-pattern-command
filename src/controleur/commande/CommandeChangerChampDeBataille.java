package controleur.commande;

import modele.Champ;
import modele.ChampDeBataille;
import modele.TERRAINS;
import vue.VueWesnothForBattle;

public class CommandeChangerChampDeBataille extends Commande {

	ChampDeBataille champDeBataille;
	TERRAINS terrain;
	
	
	public CommandeChangerChampDeBataille(ChampDeBataille champ, TERRAINS terrain) {
		super();
		this.champDeBataille = champ;
		this.terrain = terrain;
	}

	@Override
	public void executer() {
		VueWesnothForBattle.getInstance().afficherBataille(terrain);
		
	}

	@Override
	public void annuler() {
		// TODO Auto-generated method stub
		
	}

}
