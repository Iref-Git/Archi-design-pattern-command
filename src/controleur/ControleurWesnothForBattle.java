package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import controleur.commande.*;
import donnee.Exporteur;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modele.ChampDeBataille;
import modele.HEROES;
import modele.NomBataille;
import modele.HeroDeBataille;
import modele.Heroes;
import modele.MONSTRES;
import modele.Monstre;
import modele.TERRAINS;
import vue.VueWesnothForBattle;

public class ControleurWesnothForBattle extends Controleur{
	
	protected Heroes heroes = new Heroes();
	private HEROES heroChoisie = null;
	private MONSTRES monstreChoisit = null;
	private TERRAINS terrainChoisie = null;
	private String nomBataille = null;
	private ChampDeBataille bataille = new ChampDeBataille(terrainChoisie);
	public ControleurWesnothForBattle()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJardinator()");
	}
	
	
	public void initialiser()
	{
		
	}
	
	public void notifierClicDrakan() {
		//VueWesnothForBattle.getInstance().PlacerChampDrakan();
		this.heroChoisie = HEROES.DRAKAN;
		
	}

	public void notifierClicChamp(double x, double y) {
		if(heroChoisie != null) {
			Commande commande = new CommandeDeployerPersonnage(heroChoisie,x,y);
			HeroDeBataille nouveauHero = new HeroDeBataille(this.heroChoisie, x, y);
			//this.heroes.getHero().add(nouveauHero);
			this.bataille.ajouterHero(nouveauHero);
			commande.executer();
			//VueWesnothForBattle.getInstance().PlacerChampHeroes(this.heroChoisie,x,y);
		}
		if(monstreChoisit != null) {
			Commande commande = new CommandeDeployerPersonnage(monstreChoisit,x,y);
			Monstre monstre = new Monstre(this.monstreChoisit, x, y);
			this.bataille.ajouterMonstre(monstre);
			commande.executer();
			//VueWesnothForBattle.getInstance().PlacerChampMonstre(monstreChoisit, x, y);
		}
		
	}
	public void notifierChangerChamp(TERRAINS bataille) {
		Commande commande = new CommandeChangerChampDeBataille(this.bataille, bataille);
		this.bataille.setBataille(bataille);
		//this.heroes.setBataille(this.bataille);
		commande.executer();
		//VueWesnothForBattle.getInstance().afficherBataille(bataille);
	}
/*
	public void notifierClicDuelist() {
		this.heroChoisie = HEROES.DUELIST;
		
	}

	public void notifierClicHeroElf() {
		this.heroChoisie = HEROES.HEROELF;
		
	}
	
	public void notifierClicHunterOndin() {
		this.heroChoisie = HEROES.HUNTERONDIN;
	}

	public void notifierClicWarriorDwarf() {
		this.heroChoisie = HEROES.WARRIORDWARF;
		
	}

	public void notifierClicWhiteMage() {
		this.heroChoisie = HEROES.WHITEMAGE;
		
	}*/
	
	/*public void notifierClicWraith() {
		this.monstreChoisit = MONSTRES.WRAITH;
		System.out.println("Click on Wraith registered in controler");
	}*/

	public void notiferClicPlaine() {
		this.terrainChoisie = TERRAINS.PLAINE;
		
	}


	public void notifierClicChateau() {
		this.terrainChoisie = TERRAINS.CHATEAU;
		
	}


	public void notifierclicHero(HEROES heroChoisie) {
		this.heroChoisie = heroChoisie;
		this.monstreChoisit =null;
		
	}
	
	public void notifierClicMonstre(MONSTRES monstreChoisit) {
		this.monstreChoisit = monstreChoisit;
		this.heroChoisie = null;
		System.out.println("Monstre choisit: "+monstreChoisit);
	}


	public void notifierClicSauvegarder() {
		System.out.println("La sauvegarde s'en vient!");
		Exporteur exporteur = new Exporteur();
		System.out.println("allo");
		exporteur.sauvegarder(this.bataille);
	}


	public void notifierNomBataille(String text) {
		System.out.println("Yo save name");
		this.nomBataille = text;
		this.bataille.setNom(new NomBataille(nomBataille));;
	}


	

}
