package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurWesnothForBattle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modele.HEROES;
import modele.MONSTRES;
import modele.TERRAINS;
import vue.evenement.SelecteurDeBataille;
import vue.evenement.SelecteurDeHero;
import vue.evenement.SelecteurDeMonstre;

public class VueWesnothForBattle extends Vue {

	protected ControleurWesnothForBattle controleur;
	protected static VueWesnothForBattle instance = null; 
	public static VueWesnothForBattle getInstance() {if(null==instance)instance = new VueWesnothForBattle();return VueWesnothForBattle.instance;}; 
	
	private VueWesnothForBattle() 
	{
		super("jardinator.fxml", VueWesnothForBattle.class, 1294,743);
		super.controleur = this.controleur = new ControleurWesnothForBattle();
		Logger.logMsg(Logger.INFO, "new VueWesnothForBattle()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		Button actionSauvegarder = (Button)lookup("#action-sauvegarder");
		actionSauvegarder.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Tu veux sauvegarder?");
				controleur.notifierClicSauvegarder();
				
			}});
		
		Button actionNomBatailleSauvegarde = (Button)lookup("#action-sauvegarder_nom_bataille");
		actionNomBatailleSauvegarde.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Tu veux sauvegarder ce nom!?!");
				TextField nom = (TextField)lookup("#text-bataille");
				String text;
				text = nom.getText();
				System.out.println(text);
				controleur.notifierNomBataille(text);
			}});

			
		
		Rectangle champ = (Rectangle)lookup("#jardin-terre");
		champ.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent clic) {
				
				System.out.println("Clic Placer Heroes");
				double x = clic.getX();
				double y = clic.getY();
				controleur.notifierClicChamp(x,y);
				
			}});
		
		Button actionColorerBackgroundRouge = (Button)lookup("#colorer-background-rouge");
		actionColorerBackgroundRouge.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				AnchorPane background = (AnchorPane)lookup("#couleurs");
				background.setStyle("-fx-border-color: darkslategrey; -fx-background-color: red");
			}
			
		});
		
		Button actionColorerBackgroundBleu = (Button)lookup("#colorer-background-bleu");
		actionColorerBackgroundBleu.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				AnchorPane background = (AnchorPane)lookup("#couleurs");
				background.setStyle("-fx-border-color: darkslategrey; -fx-background-color: dodgerblue");
			}
			
		});
		
		Button actionColorerBackgroundJaune = (Button)lookup("#colorer-background-jaune");
		actionColorerBackgroundJaune.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				AnchorPane background = (AnchorPane)lookup("#couleurs");
				background.setStyle("-fx-border-color: darkslategrey; -fx-background-color: yellow");
			}
			
		});
		
		Button actionColorerBackgroundVert = (Button)lookup("#colorer-background-vert");
		actionColorerBackgroundVert.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				AnchorPane background = (AnchorPane)lookup("#couleurs");
				background.setStyle("-fx-border-color: darkslategrey; -fx-background-color: limegreen;");
			}
			
		});
		
		Button actionChoisirDrakan = (Button)lookup("#action-choisir-drakan");
		actionChoisirDrakan.setOnAction(new SelecteurDeHero(this.controleur, HEROES.DRAKAN));
		
		Button actionChoisirDuelist = (Button)lookup("#action-choisir-duelist");
		actionChoisirDuelist.setOnAction(new SelecteurDeHero(this.controleur, HEROES.DUELIST));
		
		Button actionChoisirHeroElf = (Button)lookup("#action-choisir-heroElf");
		actionChoisirHeroElf.setOnAction(new SelecteurDeHero(this.controleur, HEROES.HEROELF));
	
		
		Button actionChoisirHunterOndin = (Button)lookup("#action-choisir-hunterOndin");
		actionChoisirHunterOndin.setOnAction(new SelecteurDeHero(this.controleur, HEROES.HUNTERONDIN));
		
		
		Button actionChoisirWarriorDwarf = (Button)lookup("#action-choisir-warriorDwarf");
		actionChoisirWarriorDwarf.setOnAction(new SelecteurDeHero(this.controleur, HEROES.WARRIORDWARF));
		
		
		Button actionChoisirWhiteMage = (Button)lookup("#action-choisir-whiteMage");
		actionChoisirWhiteMage.setOnAction(new SelecteurDeHero(this.controleur, HEROES.WHITEMAGE));
		
		Button actionChoisirWraith = (Button)lookup("#action-choisir-wraith");
		actionChoisirWraith.setOnAction(new SelecteurDeMonstre(this.controleur, MONSTRES.WRAITH));
		
		Button actionChoisirSqueleton = (Button)lookup("#action-choisir-squeleton");
		actionChoisirSqueleton.setOnAction(new SelecteurDeMonstre(this.controleur, MONSTRES.SQUELETON));
		
		Button actionChoisirSaurian = (Button)lookup("#action-choisir-saurian");
		actionChoisirSaurian.setOnAction(new SelecteurDeMonstre(this.controleur, MONSTRES.SAURIAN));
		
		Button actionChoisirOrc = (Button)lookup("#action-choisir-orc");
		actionChoisirOrc.setOnAction(new SelecteurDeMonstre(this.controleur, MONSTRES.ORC));
		
		Button actionChoisirNaga= (Button)lookup("#action-choisir-naga");
		actionChoisirNaga.setOnAction(new SelecteurDeMonstre(this.controleur, MONSTRES.NAGA));
		
		Button actionChoisirDragon = (Button)lookup("#action-choisir-dragon");
		actionChoisirDragon.setOnAction(new SelecteurDeMonstre(this.controleur, MONSTRES.DRAGON));
		
		
		Button actionChoisirPlaine = (Button)lookup("#action-choisir-terrain-plaine");
		actionChoisirPlaine.setOnAction(new SelecteurDeBataille(controleur, TERRAINS.PLAINE));
		
		Button actionChoisirChateau = (Button)lookup("#action-choisir-terrain-chateau");
		actionChoisirChateau.setOnAction(new SelecteurDeBataille(controleur, TERRAINS.CHATEAU));
		
		Button actionChoisirRuins = (Button)lookup("#action-choisir-terrain-ruins");
		actionChoisirRuins.setOnAction(new SelecteurDeBataille(controleur, TERRAINS.RUINE));
		
		Button actionChoisirForest = (Button)lookup("#action-choisir-terrain-forest");
		actionChoisirForest.setOnAction(new SelecteurDeBataille(controleur, TERRAINS.FORET));
	}
	
	public void PlacerChampHeroes(HEROES heroes, double x, double y) {
		if(heroes == HEROES.DRAKAN) {
			ImageView heroesPlacer = new ImageView(new Image("vue/decoration/heroes/drakan.png"));
			heroesPlacer.setPreserveRatio(true);
			heroesPlacer.setFitHeight(80);
			heroesPlacer.setX(x-30);
			heroesPlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(heroesPlacer);
		}
		else if(heroes == HEROES.DUELIST) {
			ImageView heroesPlacer = new ImageView(new Image("vue/decoration/heroes/duelist.png"));
			heroesPlacer.setPreserveRatio(true);
			heroesPlacer.setFitHeight(80);
			heroesPlacer.setX(x-30);
			heroesPlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(heroesPlacer);
		}
		else if(heroes == HEROES.HEROELF) {
			ImageView heroesPlacer = new ImageView(new Image("vue/decoration/heroes/heroElf.png"));
			heroesPlacer.setPreserveRatio(true);
			heroesPlacer.setFitHeight(80);
			heroesPlacer.setX(x-30);
			heroesPlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(heroesPlacer);
		}
		else if(heroes == HEROES.HUNTERONDIN) {
			ImageView heroesPlacer = new ImageView(new Image("vue/decoration/heroes/hunterOndin.png"));
			heroesPlacer.setPreserveRatio(true);
			heroesPlacer.setFitHeight(80);
			heroesPlacer.setX(x-30);
			heroesPlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(heroesPlacer);
		}
		else if(heroes == HEROES.WARRIORDWARF) {
			ImageView heroesPlacer = new ImageView(new Image("vue/decoration/heroes/warriorDwarf.png"));
			heroesPlacer.setPreserveRatio(true);
			heroesPlacer.setFitHeight(80);
			heroesPlacer.setX(x-30);
			heroesPlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(heroesPlacer);
		}
		else if(heroes == HEROES.WHITEMAGE) {
			ImageView heroesPlacer = new ImageView(new Image("vue/decoration/heroes/whiteMage.png"));
			heroesPlacer.setPreserveRatio(true);
			heroesPlacer.setFitHeight(80);
			heroesPlacer.setX(x-30);
			heroesPlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(heroesPlacer);
		}
		
		
	}
	
	public void PlacerChampMonstre(MONSTRES monstre, double x, double y) {
		if(monstre == MONSTRES.WRAITH) {
			ImageView monstrePlacer = new ImageView(new Image("vue/decoration/monsters/Wraith.png"));
			monstrePlacer.setPreserveRatio(true);
			monstrePlacer.setFitHeight(80);
			monstrePlacer.setX(x-30);
			monstrePlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(monstrePlacer);
		}
		else if(monstre == MONSTRES.SQUELETON) {
			ImageView monstrePlacer = new ImageView(new Image("vue/decoration/monsters/Squeleton.png"));
			monstrePlacer.setPreserveRatio(true);
			monstrePlacer.setFitHeight(80);
			monstrePlacer.setX(x-30);
			monstrePlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(monstrePlacer);
		}
		else if(monstre == MONSTRES.SAURIAN) {
			ImageView monstrePlacer = new ImageView(new Image("vue/decoration/monsters/Saurian.png"));
			monstrePlacer.setPreserveRatio(true);
			monstrePlacer.setFitHeight(80);
			monstrePlacer.setX(x-30);
			monstrePlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(monstrePlacer);
		}
		else if(monstre == MONSTRES.ORC) {
			ImageView monstrePlacer = new ImageView(new Image("vue/decoration/monsters/Orc.png"));
			monstrePlacer.setPreserveRatio(true);
			monstrePlacer.setFitHeight(80);
			monstrePlacer.setX(x-30);
			monstrePlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(monstrePlacer);
		}
		else if(monstre == MONSTRES.NAGA) {
			ImageView monstrePlacer = new ImageView(new Image("vue/decoration/monsters/Naga.png"));
			monstrePlacer.setPreserveRatio(true);
			monstrePlacer.setFitHeight(80);
			monstrePlacer.setX(x-30);
			monstrePlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(monstrePlacer);
		}
		else if(monstre == MONSTRES.DRAGON) {
			ImageView monstrePlacer = new ImageView(new Image("vue/decoration/monsters/Dragon.png"));
			monstrePlacer.setPreserveRatio(true);
			monstrePlacer.setFitHeight(80);
			monstrePlacer.setX(x-30);
			monstrePlacer.setY(y-50);
			
			AnchorPane clotureVue = (AnchorPane)lookup("#jardin-cloture");
			clotureVue.getChildren().add(monstrePlacer);
		}
		
		
	}

	public void afficherBataille(TERRAINS bataille) {
		String batailleTexte = "bataille";
		if(bataille == null) return;
		if(bataille == TERRAINS.PLAINE) {
			batailleTexte = "meadow";
		}
		if(bataille == TERRAINS.CHATEAU) {
			batailleTexte = "castle";
		}
		if(bataille == TERRAINS.RUINE) {
			batailleTexte = "ruins";
		}
		if(bataille == TERRAINS.FORET) {
			batailleTexte = "forest";
		}
		System.out.println("VueWesnothForBattle.afficherBataille("+batailleTexte+")");
		
		String css = "-fx-background-image:url('vue/decoration/terrain/" + batailleTexte + ".png');";
		AnchorPane zone = (AnchorPane)lookup("#jardin-cloture");
		zone.setStyle(css);
		System.out.println(css);
	}
}
