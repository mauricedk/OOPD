public class StudentOud {
	private String naam;
	private String geslacht;
	private int studentNr;
	public static final String MAN = "man";
	public static final String VROUW = "vrouw";
	
	private static int nStudenten = 0;
	
	public Student(String naam) {
		this.naam = naam;
		nStudenten++;
		studentNr = nStudenten;
	}
		
	public String getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(String geslacht) {
		if (geslacht == MAN || geslacht == VROUW) {
			this.geslacht = geslacht;
		} else {
			System.out.println("Error: geslacht is ongeldig");
		}
	}

	public static int getNStudenten() {
		return nStudenten;
	}

	public String toString() {
		return getNaam();
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}


