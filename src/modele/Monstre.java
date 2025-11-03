package modele;

public class Monstre {
protected MONSTRES monstreChoisit;
	
	protected double x;
	protected double y;
	
	public Monstre() {
		super();
	}
	public Monstre(MONSTRES monstre, double x, double y) {
		super();
		this.monstreChoisit = monstre;
		this.x = x;
		this.y = y;
	}
	
	public MONSTRES getMonstre() {
		return monstreChoisit;
		
	}
	
	public void setMonstre(MONSTRES monstre) {
		this.monstreChoisit = monstre;
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
}
