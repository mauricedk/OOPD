public class Student extends Persoon {
	protected int nummer;
	protected Docent SLBer;
	
	public Student(String naam, String achternaam, int nummer, Docent SLBer) {
		super(naam, achternaam);
		this.nummer = nummer;
		this.SLBer = SLBer;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	@Override
	public Docent getSLBer() {
		return SLBer;
	}

	public void setSLBer(Docent sLBer) {
		SLBer = sLBer;
	}
	
	@Override
	public String toString() {
		return "\n Student [nummer= " + nummer + ", SLBer= " + SLBer + ", naam= " + naam + ", achternaam= " + achternaam + "]";
	}
}
