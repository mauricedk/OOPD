import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class GraphicsEngineApp extends PApplet {
	public static void main(String[] args) {
		PApplet.main("GraphicsEngineApp");
	}
	
	private ArrayList<DisplayObject> displayList = new ArrayList<>();
	
	public void settings() {
		size(1000, 1000);	
	}
	
	public void setup() {
		background(0);
		
		displayList.add(new Rechthoek(10, 10, 100, 100));
		displayList.add(new Rechthoek(150, 150, 100, 100));
		
		IReageerder reageerder1 = new HalloReageerder();
		
		for (DisplayObject obj : displayList) {
			obj.voegReageerderToe(reageerder1);
		}
	}
	
	public void draw() {
		for (DisplayObject obj : displayList) {
			obj.geefWeer(this, 0, 0);
		}
		
	}
	
	public void mousePressed() {
		for (DisplayObject obj : displayList) {
			if (obj.isMuisBinnen(mouseX, mouseY)) {
				obj.behandelMousePressedGebeurtenis();
			}
		}
	}
}
