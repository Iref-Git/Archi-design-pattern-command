package modele;

import donnee.Exportable;

public class HeroDeBataille implements Exportable {
	protected HEROES heroChoisie;
	
	protected double x;
	protected double y;
	
	public HeroDeBataille() {
		super();
	}
	
	public HeroDeBataille(HEROES hero) {
		super();
		this.heroChoisie = hero;
	}
	public HeroDeBataille(HEROES hero, double x, double y) {
		super();
		this.heroChoisie = hero;
		this.x = x;
		this.y = y;
	}
	
	public HEROES getHero() {
		return heroChoisie;
		
	}
	
	public void setHero(HEROES hero) {
		this.heroChoisie = hero;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String exporterXML() {
		String xml = "<sorte>" + this.heroChoisie.toString() + "</sorte>";
		xml += "<x>" + this.x + "</x>";
		xml += "<y>" + this.x + "</y>";
		return "<hero>" + xml + "</hero>";
	}

	@Override
	public String exporterJSON() {
		
		return null;
	}

}
