package controleur.commande;

import modele.HeroDeBataille;
import modele.MONSTRES;
import modele.Monstre;
import modele.HEROES;
import vue.VueWesnothForBattle;

public class CommandeDeployerPersonnage extends Commande{

	private double x;
	private double y;
	private MONSTRES typeMonstre;
	private HEROES typeHero;
	
	public CommandeDeployerPersonnage(HEROES typeHero, double x, double y) {
		super();
		this.x = x;
		this.y = y;
		this.typeHero = typeHero;
		//this.monstre = new Monstre(typeMonstre, x, y);
	}
	
	public CommandeDeployerPersonnage(MONSTRES typeMonstre, double x, double y) {
		super();
		this.x = x;
		this.y = y;
		this.typeMonstre = typeMonstre;
		//this.monstre = new Monstre(typeMonstre, x, y);
	}

	@Override
	public void executer() {
		
		//HeroDeBataille nouveauHero = new HeroDeBataille(this.heroChoisie, x, y);
		//this.heroes.getHero().add(nouveauHero);
		//VueWesnothForBattle.getInstance().PlacerChampHeroes(this.heroChoisie,x,y);
		if(this.typeHero != null) {
			VueWesnothForBattle.getInstance().PlacerChampHeroes(typeHero, x, y);
		}
		if(this.typeMonstre != null) {
			VueWesnothForBattle.getInstance().PlacerChampMonstre(typeMonstre, x, y);
		}
	}

	@Override
	public void annuler() {
		// TODO Auto-generated method stub
		
	}

}
