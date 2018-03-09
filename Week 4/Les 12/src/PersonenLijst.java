import java.util.ArrayList;

public class PersonenLijst {
	private ArrayList<Persoon> lijst;
	
	public PersonenLijst() {
		lijst = new ArrayList<>(); 
	}
	
	public ArrayList<Student> getSLBStudenten(Docent SLBer) {
	}
	
	public static void main(String[] args) {
		PersonenLijst p = new PersonenLijst();
		Docent piet=new Docent("Piet","Jansen","jnsnp");
		Student marie=new Student("Marie","Pieters",31415,piet);
         Student jan=new Student("Jan","de Vries",92653,null); // nog geen SLB’er
         p.lijst.add(piet);
         p.lijst.add(marie);
         p.lijst.add(jan);
        // voeg zelf nog enkele docenten en studenten toe
         ArrayList<Student> studentenVanPiet=p.getSLBStudenten(piet);
	
	}
}
