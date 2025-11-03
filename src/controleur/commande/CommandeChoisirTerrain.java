package controleur.commande;

import modele.Champ;
import modele.TERRAINS;

public class CommandeChoisirTerrain extends Commande{
	
	Champ champDeBataille;
	TERRAINS terrain;
	
	
	public CommandeChoisirTerrain(Champ champ, TERRAINS terrain) {
		super();
		this.champDeBataille = champ;
		this.terrain = terrain;
	}

	@Override
	public void executer() {
		
		
	}

	@Override
	public void annuler() {
		// TODO Auto-generated method stub
		
	}

}
