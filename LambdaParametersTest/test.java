@FunctionalInterface
interface I {
	void print(int x);
}

class test {
	public static void main(String... args) {
		int y = 1;

		I i1 = (x) -> System.out.println("Interface 1" + ":" + x + y);
		I i2 = (x) -> System.out.println("Interface 2" + ":" + x + y);

		i1.print(1);
		i2.print(2);
	}
}
