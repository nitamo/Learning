import java.util.*;
class test {
	public static void main(String... args) {
		
		List<Integer> lsi1 = new ArrayList<>();
		lsi1.add(new Integer(1));
		
		//		Upper-bounds
		List<? extends Number> ls1; 

		//We can remove objects from an upper-bounded List
		//But we cannot add objects
		ls1 = lsi1;
		ls1.remove(0);
		//ls1.add(new Integer(1)); //this will not compile (Integer cannot be converted to #CAP1 which extends Number)

		lsi1.add(1); lsi1.add(2);
		System.out.println(lsi1);
		System.out.println(ls1);

		//		Unbounded
		List<?> ls2;
		ls2 = lsi1;
		System.out.println(ls2);
		//ls2.add(new Integer(1)); //this will not compile (Integer cannot be converted to #CAP1 which extends Number)

		//		Lower-bounds
		List<? super Integer> ls3;
		ls3 = lsi1;
		ls3.add(new Integer(3));
		//ls3.add(new Object()); //this will not compile (Object cannot be converted to #CAP1 which extends Object and supers Integer)
		System.out.println(ls3);
	}
}
