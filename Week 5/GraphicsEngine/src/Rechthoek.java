import processing.core.PApplet;

public class Rechthoek extends Figuur {
	
	public Rechthoek(float x, float y, float breedte, float hoogte) {
		super(x,y,breedte,hoogte);
		super.zetStil();
	}
	
	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		app.noStroke();
		app.fill(kleur);
		app.rect(x, y, breedte, hoogte);
	}
}
