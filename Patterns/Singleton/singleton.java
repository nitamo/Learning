class CSingleton {
	private static CSingleton single;

	private CSingleton() {
		System.out.println("New CSingleton created");
	}

	public static CSingleton getInstance() {
		if (null == single) 
			synchronized(CSingleton.class) {
				single = new CSingleton();
			}
		
		return single;
	}
}

public class singleton {
	public static void main(String[] args) { 
		CSingleton single1 = CSingleton.getInstance();
		CSingleton single2 = CSingleton.getInstance();
		CSingleton single3 = CSingleton.getInstance();
	}
}
