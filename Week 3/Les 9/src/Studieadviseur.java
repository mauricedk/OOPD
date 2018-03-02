public class Studieadviseur {
	private static double totaalCijfer = 0;

	public static boolean krijgtPositiefStudieadvies(Student s) {
		totaalCijfer = 0;
		int[] cijfers = s.getCijfers();
		
		for (int i = 0; i < cijfers.length; i++) {
			totaalCijfer += cijfers[i];
		}
		double eindcijfer = totaalCijfer / cijfers.length;
		
		return eindcijfer >= 5.5;
	}
}