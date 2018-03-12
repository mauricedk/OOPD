import java.util.ArrayList;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class GraphicsEngineApp extends PApplet {
	public static void main(String[] args) {
		PApplet.main("GraphicsEngineApp");
	}
	
	private ArrayList<DisplayObject> objects = new ArrayList<>();
	
	public void settings() {
		size(1000, 1000);	
	}
	
	public void setup() {
		objects.add(new Rechthoek(10, 10, 100, 100));

	}
	
	public void draw() {
		for (DisplayObject obj : objects) {
			obj.geefWeer(this, 0, 0);
		}
		
	}
	
	public void mousePressed() {
	}
}
