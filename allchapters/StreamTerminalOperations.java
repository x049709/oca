package allchapters;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamUtils sU = new StreamUtils();
		sU.minValue();
		sU.findMatch();
		sU.reduceValue();
		sU.reduceValueAlso();
	}

}

class StreamUtils {
	void minValue () {
		Stream<String> sS = Stream.of("monkey", "ape", "bonobo");
		//Comparator has 1 abstract method(compare), <T> return value and <T1, T2> inputs
		Comparator<String> comp = (s1, s2) -> {return s1.length() - s2.length();};
		Optional<String> minSs = sS.min(comp);
		minSs.ifPresent(System.out::println);
	}
	void findMatch () {
		Stream<String> sM = Stream.generate(()->"chimp");
		sM.findAny().ifPresent(System.out::println);
	}
	
	void reduceValue () {
		Stream<String> sS = Stream.of("monkey", "ape", "bonobo");
		String word = sS.reduce("", (s, t) -> s+t);
		System.out.println(word);
	}

	void reduceValueAlso () {
		Stream<String> sS = Stream.of("monkey", "ape", "bonobo");
		String wordAlso = sS.reduce("", String::concat);
		System.out.println(wordAlso);
	}
	
	void collectValues () {
		StringBuilder sB = new StringBuilder();
		Supplier<StringBuilder> sSup1 = () -> sB;  
		Supplier<StringBuilder> sSup2 = StringBuilder::new;
		Supplier<StringBuilder> sSup3 = () -> new StringBuilder();
		BiConsumer<StringBuilder, StringBuilder> bCons1 = (sB1, sB2) -> sB1.append(sB2);
		BiConsumer<StringBuilder, StringBuilder> bCons2 = (sB1, sB2) -> sB1.append(sB2);		
	}

}
