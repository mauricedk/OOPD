import processing.core.PApplet;

public class Cirkel extends Figuur {
	
	private float diameter;
	
	public Cirkel(float x, float y, float diameter) {
		super(x,y);
		this.diameter = diameter;
		super.zetStil();
	}
		
	public void teken(PApplet p) {
		p.noStroke();
		p.fill(kleur);
		p.ellipse(x, y, diameter, diameter);
	}
}
