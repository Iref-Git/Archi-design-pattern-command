package vue.evenement;

import controleur.ControleurWesnothForBattle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modele.TERRAINS;

public class SelecteurDeBataille implements EventHandler<ActionEvent> {
	
	protected ControleurWesnothForBattle controleur = null;
	protected TERRAINS bataille = null;
	
	public SelecteurDeBataille(ControleurWesnothForBattle controleur, TERRAINS champ) {
		this.controleur = controleur;
		this.bataille = champ;
	}

	@Override
	public void handle(ActionEvent e) {
		System.out.println("Bataille sur le " + bataille);
		controleur.notifierChangerChamp(bataille);
		
	}

}
