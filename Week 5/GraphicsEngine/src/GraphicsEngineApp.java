import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class GraphicsEngineApp extends PApplet {
	public static void main(String[] args) {
		PApplet.main("GraphicsEngineApp");
	}
	
	protected ArrayList<DisplayObject> displayList = new ArrayList<>();
	public DisplayObjectContainer container = new DisplayObjectContainer(0,0);
	
	public void settings() {
		size(1000, 1000);	
	}	
	
	public void setup() {
		
		container.voegToeObject(new Rechthoek(10, 10, 100, 100));
		container.voegToeObject(new Rechthoek(150, 150, 100, 100));
		
		displayList.add(container);
		
		IReageerder reageerder1 = new HalloReageerder();
		
		container.voegReageerderToe(reageerder1);
		
//		for (DisplayObject obj : displayList) {
//			obj.voegReageerderToe(reageerder1);
//		}
	}
	
	public void draw() {
		background(0);
		for (DisplayObject obj : displayList) {
			obj.geefWeer(this, 0, 0);
			obj.doeStap();
		}
	}
	
	public void mousePressed() {
		for (DisplayObject obj : displayList) {
			if (obj.isMuisBinnen(mouseX, mouseY)) {
				obj.behandelMousePressedGebeurtenis();
				System.out.println(container);
			}
		}
	}
}
