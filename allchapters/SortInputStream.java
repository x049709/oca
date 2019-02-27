package allchapters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortInputStream {
	private static final Map<String, Integer> m1 = new HashMap<String, Integer>();
	private static final Map<String, Integer> m2 = new HashMap<String, Integer>();
	private static final Map<String, Integer> m3 = new HashMap<String, Integer>();
	
	private static List<Map<String, Integer>> nestedList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSorter f = new FileSorter();
		f.readFileIn(new File("DVDInfo.txt"));
		
		m1.put("m11", 11);
		m1.put("m12", 12);
		m1.put("m13", 13);
		m2.put("m21", 15);
		m3.put("m31", 16);
		nestedList = Arrays.asList(m1,m2,m3);
		Map<String, Map<String, Integer>> newMap = f.handlerNestedCollection(nestedList);
		System.out.println(newMap);
		
	}

}

class FileSorter {
	
	
	void readFileIn (File in) {
	BufferedReader br =null;
	try{
		FileReader fr = new FileReader(in);
		br = new BufferedReader(fr);
		Stream<String> s = br.lines().sorted();
		s.forEach(System.out::println);
	} catch(Exception io){
	} finally{
		if ( br != null )try{br.close();}catch(Exception e){}
		}
	}
	
	public Map<String,Map<String, Integer>> handlerNestedCollection(List<Map<String, Integer>> input) {
        Map<String, Map<String, Integer>> newMap = new HashMap<>();
        IntStream.range(0, input.size())
                .forEach(i -> newMap.put("Nested at position " + i, input.get(i)));
        return newMap;
    }
}
