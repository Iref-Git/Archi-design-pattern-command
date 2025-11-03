package vue.evenement;

import controleur.ControleurWesnothForBattle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import modele.HEROES;

public class SelecteurDeHero implements EventHandler<ActionEvent> {
	
	protected ControleurWesnothForBattle controleur = null;
	protected HEROES heroChoisie = null;
	
	public SelecteurDeHero(ControleurWesnothForBattle controleur, HEROES hero) {
		
		this.controleur = controleur;
		this.heroChoisie = hero;
	}

	@Override
	public void handle(ActionEvent e) {
		System.out.println("Clic Ton HERO");
		controleur.notifierclicHero(heroChoisie);
		
	}

	

}
