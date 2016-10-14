abstract class A {
	abstract void print();
}

class test extends A {
	private void print() {
		System.out.println("Hello");
	}
}
