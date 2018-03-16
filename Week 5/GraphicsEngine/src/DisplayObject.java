import java.util.ArrayList;
import processing.core.PApplet;


public abstract class DisplayObject {
	
	protected float x, y, vx, vy, ax, ay, breedte, hoogte;
	protected boolean isZichtbaar;
	
	protected ArrayList<IReageerder> reageerders = new ArrayList<>();
	
	public DisplayObject (float x, float y, float breedte, float hoogte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
		vx = 0;
		vy = 0;
		ax = 0;
		ay = 0;
	}
	
	public abstract void geefWeer(PApplet app, float startX, float startY);
	
	public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
		
	}
	
	protected boolean isMuisBinnen(int muisX, int muisY) {
		if (muisX >= x && muisX < x + breedte && muisY >= y && muisY < y + hoogte) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	protected void behandelMousePressedGebeurtenis() {
		for (IReageerder r : reageerders) {
			r.doeActie();
		}
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
	
	private void pasVersnellingToe() {
		vx += ax;
		vy += ay;
	}
	
	private void pasSnelheidToe() {
		x += vx;
		y += vy;
	}
	
		
	public void voegReageerderToe(IReageerder reageerder) {
		reageerders.add(reageerder);
	}
	
	public void verwijderReageerder(IReageerder reageerder) {
		reageerders.remove(reageerder);
	}
	
	//------------Getters & Setters-----------------------
	
	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	public float getVx() {
		return vx;
	}


	public void setVx(float vx) {
		this.vx = vx;
	}


	public float getVy() {
		return vy;
	}


	public void setVy(float vy) {
		this.vy = vy;
	}


	public float getAx() {
		return ax;
	}


	public void setAx(float ax) {
		this.ax = ax;
	}


	public float getAy() {
		return ay;
	}


	public void setAy(float ay) {
		this.ay = ay;
	}


	public float getBreedte() {
		return breedte;
	}


	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}


	public float getHoogte() {
		return hoogte;
	}


	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}


	public boolean isZichtbaar() {
		return isZichtbaar;
	}


	public void setZichtbaar(boolean isZichtbaar) {
		this.isZichtbaar = isZichtbaar;
	}
}
