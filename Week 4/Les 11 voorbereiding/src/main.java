
public class main {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		B b1 = new A();
		B b2 = new B();
		B b3 = new C();
		C c1 = new A();
		C c2 = new B();
		C c3 = new C();
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}

}
