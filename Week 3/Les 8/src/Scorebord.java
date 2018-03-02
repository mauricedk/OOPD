public class Scorebord {
	
	private int score;
	private String naam;
	
	
	public Scorebord(String naam) {
		this.naam = naam;
		this.score = 0;
	}
	
	public void maakLeeg() {
		score = 0;
	}
		
	
	public void printScorebord() {
		System.out.println(naam + ": " + score + " Punten");
	}
}