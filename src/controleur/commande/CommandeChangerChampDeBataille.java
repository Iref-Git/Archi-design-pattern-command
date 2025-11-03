package controleur.commande;

import modele.Champ;
import modele.TERRAINS;

public class CommandeChangerChampDeBataille extends Commande {

	Champ champDeBataille;
	TERRAINS terrain;
	
	
	public CommandeChangerChampDeBataille(Champ champ, TERRAINS terrain) {
		super();
		this.champDeBataille = champ;
		this.terrain = terrain;
	}

	@Override
	public void executer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void annuler() {
		// TODO Auto-generated method stub
		
	}

}
