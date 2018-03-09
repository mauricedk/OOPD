public class Persoon {
	protected String naam, achternaam;

	public Persoon(String naam, String achternaam) {
		this.naam = naam;
		this.achternaam = achternaam;
	}

	public String getNaam() {
		return naam;
	}
	
	public Docent getSLBer() {
		return null;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return achternaam;
	}

	public void setVoornaam(String voornaam) {
		this.achternaam = voornaam;
	}
}
