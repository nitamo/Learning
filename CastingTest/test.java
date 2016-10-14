interface I {}
class A implements I {}
class B implements I {}
class C extends A {}
class D extends B {}

class test {
	public static void main(String... args) {
		D d = new D();
		C c = new C();
		B b = d;
		D c1 = (D)b;
		int test = 1;
	}
}
