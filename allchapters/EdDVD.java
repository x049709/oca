package allchapters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EdDVD {

	public static void main(String[] args) {
		DVDRdr dr = new DVDRdr();
		String dataRead = dr.readConsole();
	}
}
	
class DVDRdr {
	public String readConsole () {
		String everything = null;
		List<DVDInfo> dvdList = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("DVDInfo.txt"))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				loadArray(dvdList, line);
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} catch (IOException e) {
			System.out.println("Catch: " + e.getMessage());
		}
		System.out.println("Data read: \n" + everything);
		
		Collections.sort(dvdList);
		
		for (DVDInfo dvdInfo: dvdList) {
			System.out.println(dvdInfo.toString());
		}
		
		System.out.println("\n");
		
		return everything;
	}
	
	public void loadArray(List<DVDInfo> dvdList, String line) {
		int titleSlash = line.indexOf("/");
		int genreSlash = line.indexOf("/", titleSlash + 1);
		String title = line.substring(0,titleSlash);
		String genre = line.substring(titleSlash+1, genreSlash);
		String leadActor = line.substring(genreSlash+1, line.length());
		DVDInfo dvdInfo = new DVDInfo(title,genre,leadActor);
		dvdList.add(dvdInfo);
	}
	
class DVDInfo implements Comparable<DVDInfo> {
	String title,genre,leadActor;
	
	DVDInfo (String t, String g, String l) {
		this.title = t;
		this.genre = g;
		this.leadActor = l;
	}
	
	public int compareTo(DVDInfo o) {
		DVDInfo d = o;
		return title.compareTo(d.getTitle());
	}
	
	public String toString () {
		return "DVD Info: " + this.title + " " + this.genre + " " + this.leadActor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
}

class GenreSort implements Comparator<DVDInfo> {
	public int compare(DVDInfo one, DVDInfo two) {
		return one.getGenre().compareTo(two.getGenre());
	}
}


}
