public class test {
	public static void main(String[] args) {
		byte b1 = Byte.MIN_VALUE;
		byte b2 = Byte.MAX_VALUE;
		
		System.out.println(b1 + " " + Integer.toBinaryString(b1));
		System.out.println(b2 + " " + Integer.toBinaryString(b2));
		
		byte b3 = 1;
		for(int i = 0; i < 8; i++) {
			b3 = (byte)(b3 << 1);
			System.out.println(b3 + " " + Integer.toBinaryString(b3));
		}
			
		int i1 = 0;
		byte b4;
		b4 = 1;
		i1 = b4;
	}
}
