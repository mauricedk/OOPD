import java.util.ArrayList;

import processing.core.PApplet;

public class DisplayObjectContainer extends DisplayObject {
	
	protected ArrayList<DisplayObject> objectenLijst = new ArrayList<>();

	public DisplayObjectContainer(float x, float y) {
		super(x, y, 0, 0);
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		for (DisplayObject obj : objectenLijst) {
			obj.geefWeer(app, startX, startY);
		}
	}

	@Override
	public void doeStap() {
		for (DisplayObject obj : objectenLijst) {
			obj.setSnelheid(1, 0);
			obj.doeStap();
		}
	}
	
	@Override
	protected boolean isMuisBinnen(int muisX, int muisY) {
		for (DisplayObject obj : objectenLijst) {
			if (obj.isMuisBinnen(muisX - (int)this.x, muisY - (int)this.y)) {
				return true;
			}
		}
		return false;
	}
	
	public void voegToeObject(DisplayObject obj) {
		objectenLijst.add(obj);
	}
	
	public void verwijderObject(DisplayObject obj) {
		objectenLijst.remove(obj);
	}
	
	/*--------------------Getters & Setters--------------------------*/

	@Override
	public String toString() {
		return "DisplayObjectContainer [objectenLijst=" + objectenLijst + "]";
	}
	
}
