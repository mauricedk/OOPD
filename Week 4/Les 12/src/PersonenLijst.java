import java.util.ArrayList;

public class PersonenLijst {
	private ArrayList<Persoon> lijst;
	
	public PersonenLijst() {
		lijst = new ArrayList<>(); 
	}
	
	public ArrayList<Persoon> getSLBStudenten(Docent SLBer) {
		ArrayList<Persoon> lijstStuds = new ArrayList<>();
		
		for(Persoon p: lijst) {
			if (p.getSLBer() == SLBer) {
				lijstStuds.add(p);
			}
		}
		return lijstStuds;
	}
	
	public static void main(String[] args) {
		PersonenLijst p = new PersonenLijst();
		Docent piet=new Docent("Piet","Jansen","jnsnp");
		Docent herman=new Docent("Herman","van der Zand","hrmn");
		Student marie=new Student("Marie","Pieters",314152,piet);
		Student freddy=new Student("Freddy","Bladblazer",314153,herman);
		Student eddie=new Student("Eddie","Knol",314154,herman);
        Student jan=new Student("Jan","de Vries",926538,null); // nog geen SLB’er
        
        p.lijst.add(piet);
        p.lijst.add(herman);
        p.lijst.add(marie);
        p.lijst.add(freddy);
        p.lijst.add(eddie);
        p.lijst.add(jan);
        // voeg zelf nog enkele docenten en studenten toe
        
        ArrayList<Persoon> studentenVanPiet=p.getSLBStudenten(herman);
        System.out.println(studentenVanPiet);
	
	}
}
