import processing.core.PApplet;

public class RadioKnop extends Switch implements IDoelwit{
	

	public RadioKnop(PApplet app, float x, float y, float breedte, float hoogte) {
		super(app, x, y, breedte, hoogte);
		isAan = false;
	}
	
	@Override
	public void tekenKnop() {
		app.ellipseMode(PApplet.CENTER);
		app.noStroke();
		app.fill(255);
		app.ellipse(x, y, breedte, hoogte);
		if (isAan) {
			app.fill(0);
			app.ellipse(x, y, breedte - breedte/4, hoogte - hoogte/4);
		}
	}
	
	@Override
	public void schakel() {
		doeKnopActie();
		for (IDoelwit dw: doelwitten) {
			RadioKnop rk = (RadioKnop) dw;
			rk.isAan = false;
		}
		this.isAan = true;
	}
	
	@Override
	public void handelInteractieAf() {
		schakel();
	}
	
	@Override 
	public boolean isMuisOverKnop() {
		if (PApplet.dist(app.mouseX, app.mouseY, x, y) < breedte/2) {
			return true;
		}
		else {
			return false;
		}
	}
}
