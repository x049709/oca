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
		System.out.println("In 3 lines:");
		Map<String, String> env = System.getenv();
		
		BiConsumer<String, String> printEnv = (key, value) -> {
			System.out.println("Env key: " + key + ", Env value: " + value);	
		};
		printEnv.accept("USER", env.get("USER"));
		
		System.out.println("To print all values in 2 lines:");
		System.getenv().forEach(printEnv);
		
		System.out.println("To print all values in one line:");
		//to print all values in one line
		System.getenv().forEach((key, value) -> {
			System.out.println("Env key: " + key + ", Env value: " + value);	
		});
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

