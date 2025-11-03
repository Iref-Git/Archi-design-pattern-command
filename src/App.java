
import architecture.Controleur;
import architecture.Fenetre;
import vue.VueWesnothForBattle;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VueWesnothForBattle.class);
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
