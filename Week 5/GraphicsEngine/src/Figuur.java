import processing.core.PApplet;

public abstract class Figuur extends DisplayObject{
	
	protected int kleur;
	
	public Figuur (float x, float y,float breedte, float hoogte) {
		super(x,y,breedte,hoogte);		
		kleur = 0xFFFFFFFF;
	}
	
	public void setKleur(int kleur) {
		this.kleur = kleur;
	}
	
	public abstract void geefWeer(PApplet app, float startX, float startY);
}
