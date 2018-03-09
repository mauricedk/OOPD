import processing.core.PApplet;

public class testApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main("testApp");
	}
	
	private Figuur freddy = new Cirkel(150,150,50);
	private Figuur eddie = new Rechthoek(25,25,50,50);
	
	
	public void settings() {
		//size(3000, 2500);
		fullScreen();
	}
	
	public void setup() {
		freddy.setSnelheid(10, 10);
		//freddy.setVersnelling(2, 2);
	}
	
	public void draw() {
		this.background(0);
		freddy.doeStap();
		freddy.teken(this);
		eddie.teken(this);
	}

}
