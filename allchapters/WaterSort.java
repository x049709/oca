package allchapters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterSort {

	public static void main(String[] args) {
		Water hardW = new Water("Hard");
		Water saltW = new Water("Salt");
		Water rainW = new Water("Rain");
		Water snowW = new Water("Snow");
		List<Water> wList = new ArrayList<>();
		wList.add(hardW);
		wList.add(saltW);
		wList.add(rainW);
		wList.add(snowW);
		SourceSort ss = new SourceSort();
		Collections.sort (wList,ss);
		System.out.println("Sorted: " + wList);

		//Inner comparator class
		Comparator <Water> wSort = new Comparator <Water>() {
			@Override
			public int compare(Water one, Water two) {
				return one.getSource().compareTo(two.getSource());
			}			
		};
		
		//Regular comparator class
		Collections.sort (wList,wSort);
		System.out.println("Sorted w Inner Class: " + wList);
	
	

	}
}

class Water {
	private String source;
	public Water (String source) {
		this.source = source;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String toString () {
		return this.source;
	}
}

class SourceSort implements Comparator<Water> {
	@Override
	public int compare(Water one, Water two) {
		return one.getSource().compareTo(two.getSource());
	}
}


