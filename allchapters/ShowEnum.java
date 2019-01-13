package allchapters;
//Singleton pattern using enums (there is only one instance of an enum constant)
import java.util.*;
public enum ShowEnum {
	INSTANCE;
	
	private Set<String> availableSeats;
		
	private ShowEnum() {
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
	}
	
	private static void ticketAgentBooks (String seat) {
		ShowEnum show = ShowEnum.INSTANCE;
		System.out.println(show.bookSeat(seat));
	}
	

}
