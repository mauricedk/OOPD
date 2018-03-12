import processing.core.PApplet;

public abstract class Figuur extends DisplayObject{
	
	protected int kleur;
	
	public Figuur (float x, float y,float breedte, float hoogte) {
		super(x,y,breedte,hoogte);		
		kleur = 0xFFFFFFFF;
	}
	
	public void doeStap() {
		if (!staatStil()) {
			pasVersnellingToe();
			pasSnelheidToe();
		}
	}
	
	public void setSnelheid(float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}
	
	public void setVersnelling(float ax, float ay) {
		this.ax = ax;
		this.ay = ay;
	}
	
	public void zetStil() {
		vx = vy = ax = ay = 0;
	}
	
	public boolean staatStil() {
		return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
	}
	
	public void setKleur(int kleur) {
		this.kleur = kleur;
	}
	
	public abstract void geefWeer(PApplet app, float startX, float startY);
	
	private void pasVersnellingToe() {
		vx += ax;
		vy += ay;
	}
	
	private void pasSnelheidToe() {
		x += vx;
		y += vy;
	}
}
