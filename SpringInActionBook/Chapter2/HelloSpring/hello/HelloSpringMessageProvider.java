package hello;
public class HelloSpringMessageProvider implements MessageProvider {
	@Override
		public String getMessage() {
			return "Hello Spring!";
		}
}
