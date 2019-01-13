package allchapters;

import java.awt.Color;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Planets {

	public static void main(String[] args) {
		
	}

}

class Planet {
	private String name = "Unknown";
	private Color priColor = Color.WHITE;
	private Integer noOfMoons = 0;
	private boolean ringed = false;
	
	public Planet (String name, Color priColor, Integer noOfMoons, boolean ringed ) {
		this.name = name;
		this.priColor = priColor;
		this.noOfMoons = noOfMoons;
		this.ringed = ringed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getPriColor() {
		return priColor;
	}

	public void setPriColor(Color priColor) {
		this.priColor = priColor;
	}

	public Integer getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(Integer noOfMoons) {
		this.noOfMoons = noOfMoons;
	}

	public boolean isRinged() {
		return ringed;
	}

	public void setRinged(boolean ringed) {
		this.ringed = ringed;
	}
	
}

class PlanetPredicates {
	public static Predicate<Planet> hasMoonsMoreThan(Integer moons) {
		return p -> p.getNoOfMoons() > moons;
	}
	public static Predicate<Planet> hasAColor() {
		return p -> p.getPriColor() != Color.BLACK;
	}
	public static List<Planet> filterPlanets(List<Planet> planetList, Predicate<Planet> predicate) {
		return planetList.stream().filter(predicate).collect(Collectors.<Planet>toList());
	}
	public static StringBuilder listFilteredPlanets (List<Planet> planetList, Predicate<Planet> predicate) {
		StringBuilder planets = new StringBuilder();
		planetList.stream().filter((planet) -> (predicate.test(planet))).forEach((planet) -> {	
			planets.append(planet).append(" ");});
		return planets;
	}
}
