public class C extends B {
	protected String s;
	
	public C(String s1, String s2, String s3) {
		super(s1, s2);
		s = s3;

		//System.out.println(super.super.s);
		System.out.println(super.s);
		System.out.println(this.s);
	}
}