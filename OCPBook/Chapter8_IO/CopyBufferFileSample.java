import java.io.*;
import java.util.*;

class CopyBufferFileSample {
	static File input;
	static File output;
	final static int BUF_SIZE = 1024;
	static byte[] buffer = new byte[BUF_SIZE];
	static Random rnd = new Random(BUF_SIZE);

	public static void main(String... args) { 
		if (args.length == 0) 
			showError("No args are given" );
		
		switch(args[0].toLowerCase()) {
			case "g":
				System.out.println( "Generate" );
				if(args.length < 2)
					showError("No file name is given");
				output = new File(args[1]);
				generate();
				break;
			case "c":
				System.out.println( "Copy" );
				if(args.length < 3)
					showError("Not enough parameters, check your input");
				input = new File(args[1]);
				output = new File(args[2]);
				copy();
				break;
			default:
				showError("Unknown command is given");
		}
	}

	public static void generate() {
		try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(output))) {
			rnd.nextBytes(buffer);
			out.write(buffer, 0, BUF_SIZE);
		}
		catch (Exception e) {
			showError("Error. Cannot generate file");
		}
	}

	public static void copy() {
		try(InputStream in = new BufferedInputStream(new FileInputStream(input));
		    OutputStream out = new BufferedOutputStream(new FileOutputStream(output))) {
			    int lengthRead = 0;
			    while((lengthRead = in.read(buffer)) > 0 ) {
				    out.write(buffer, 0, lengthRead);
				    out.flush();
			    }
		}
		catch (Exception e) {
			showError("Error. Cannot copy file");
		}
	}

	public static void showError(String msg) {
		System.out.println( msg);
		System.exit(1);
	}
}
