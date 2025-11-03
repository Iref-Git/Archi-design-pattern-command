package vue.evenement;

import controleur.ControleurWesnothForBattle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import modele.MONSTRES;


public class SelecteurDeMonstre implements EventHandler<ActionEvent>  {
	protected ControleurWesnothForBattle controleur = null;
	protected MONSTRES monstreChoisit = null;
	public SelecteurDeMonstre(ControleurWesnothForBattle controleur, MONSTRES monstre) {
		this.controleur = controleur;
		this.monstreChoisit = monstre;
	}
	
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Clic Ton HERO");
		controleur.notifierClicMonstre(monstreChoisit);
		
	}
}
