package allchapters;
//Singleton pattern with lazy init (not eager)
import java.util.*;
public class Show {
	private static  Show INSTANCE;
	private Set<String> availableSeats;
	
	public static Show getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Show();
		}
		return INSTANCE;
	}
	
	private Show() {
		availableSeats = new HashSet<String> ();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
	
	public static void main(String[] args) {	
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
		
		displaySizeMinAndMax(Boolean.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		displaySizeMinAndMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		displaySizeMinAndMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
		//int $$$$$ = 2, ______, $_$_$_$_; 12dd=5;

	    }

	public static void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
			System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, max);
	}
	
	private static void ticketAgentBooks (String seat) {
		Show show = Show.getInstance();
		System.out.println(show.bookSeat(seat));
	}
	

}
