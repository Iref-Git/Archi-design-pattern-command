package controleur.commande;

import modele.HeroDeBataille;
import modele.MONSTRES;
import modele.Monstre;
import modele.ChampDeBataille;
import modele.HEROES;
import vue.VueWesnothForBattle;

public class CommandeDeployerPersonnage extends Commande{

	private double x;
	private double y;
	private MONSTRES typeMonstre;
	private HEROES typeHero;
	private ChampDeBataille champ;
	private Monstre monstre;
	private HeroDeBataille hero;
	
	public CommandeDeployerPersonnage(HEROES typeHero, double x, double y, ChampDeBataille champ) {
		super();
		this.x = x;
		this.y = y;
		this.typeHero = typeHero;
		this.champ = champ;
		//this.monstre = new Monstre(typeMonstre, x, y);
	}
	
	public CommandeDeployerPersonnage(MONSTRES typeMonstre, double x, double y, ChampDeBataille champ) {
		super();
		this.x = x;
		this.y = y;
		this.typeMonstre = typeMonstre;
		this.champ = champ;
		//this.monstre = new Monstre(typeMonstre, x, y);
	}

	@Override
	public void executer() {
		
		//HeroDeBataille nouveauHero = new HeroDeBataille(this.heroChoisie, x, y);
		//this.heroes.getHero().add(nouveauHero);
		//VueWesnothForBattle.getInstance().PlacerChampHeroes(this.heroChoisie,x,y);
		if(this.typeHero != null) {
			VueWesnothForBattle.getInstance().placerChampHeroes(typeHero, x, y);
			HeroDeBataille hero = new HeroDeBataille(typeHero,x,y);
			champ.ajouterHero(hero);
		}
		if(this.typeMonstre != null) {
			VueWesnothForBattle.getInstance().placerChampMonstre(typeMonstre, x, y);
			Monstre monstre = new Monstre(typeMonstre,x,y);
			champ.ajouterMonstre(monstre);
		}
	}

	@Override
	public void annuler() {
			VueWesnothForBattle.getInstance().supprimerPersonnage(x, y);
			if(this.typeHero != null) {
				champ.supprimerHero(hero);
			}
			if(this.typeMonstre != null) {
				champ.supprimerMonstre(monstre);
			}
	}

}
