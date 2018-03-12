import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class KnoppenApp extends PApplet {
	
	public final int SIZE = 50;
	public final int X = 60;
	public final int Y = 60;

	public static void main(String[] args) {
		PApplet.main(new String[] { "KnoppenApp" });
	}

	private ArrayList<Knop> radioKnoppen = new ArrayList<>();

	//private Licht licht;
	//private Tekstraam tekstraam;

	public void settings() {
		size(1000, 1000);
	}

	public void setup() {
		background(0);
		//licht = new Licht(this);
		// tekstraam = new Tekstraam(this,"OOPD",250,250);

		// set 1
		RadioKnop radio = new RadioKnop(this, X, Y, SIZE, SIZE);
		radioKnoppen.add(radio);
		RadioKnop radio2 = new RadioKnop(this, X + X, Y, SIZE, SIZE);
		radioKnoppen.add(radio2);
		RadioKnop radio3 = new RadioKnop(this, X + X * 2, Y, SIZE, SIZE);
		radioKnoppen.add(radio3);

		radio.voegDoelwitToe(radio2);
		radio.voegDoelwitToe(radio3);

		radio2.voegDoelwitToe(radio);
		radio2.voegDoelwitToe(radio3);

		radio3.voegDoelwitToe(radio);
		radio3.voegDoelwitToe(radio2);
	}

	public void draw() {
		for (Knop k : radioKnoppen) {
			k.tekenKnop();
		}
	}

	public void mousePressed() {
		for (Knop k : radioKnoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}
