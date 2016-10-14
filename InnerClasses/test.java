class A {
	String s = "A";

	class B {
		String s = "B";

		class C {
			String s = "C";

			void printAll() {
				System.out.println(s);
				System.out.println(B.this.s);
				System.out.println(A.this.s);
			}
		}
	}

	static class StaticClass {
		static String ss = "StaticClass";
	}

	void printMe() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(this.new B().s);
		System.out.println(this.new B().new C().s);
	}

	void testStatic() {
	}
}

public class test {
	public static void main(String... args) {
		A a = new A();
		a. printMe();

		System.out.println("===");
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.printAll();

		System.out.println(A.StaticClass.ss);
	}
}
