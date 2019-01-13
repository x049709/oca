package allchapters;

import java.util.Map;
import java.util.function.BiConsumer;

public class EdBiConsumer {

	public static void main(String[] args) {
		BCMain bc = new BCMain();
		bc.runIt();
	}
}

class BCMain {
	public void runIt () {
		Map<String, String> env = System.getenv();
		BiConsumer<String, String> printEnv = (key, value) -> {
			System.out.println("Env key: " + value);	
		};
		printEnv.accept("USER", env.get("USER"));
	}
}

class BCUser {
	String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

