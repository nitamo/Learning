import javax.swing.text.DateFormatter;
import java.text.*;
import java.util.Date;

class test2 {
	static	ThreadLocal<DateFormatter> tldf = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

	public static void main(String... args) {
		DateFormatter df = tldf.get();
		System.out.println(df
				.getFormat()
				.format(new Date()));
	}
}
