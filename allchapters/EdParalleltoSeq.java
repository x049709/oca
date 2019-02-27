package allchapters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EdParalleltoSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdParalleltoSeqRun eU = new EdParalleltoSeqRun();
		eU.runEdParalleltoSeq();

	}

}

class EdParalleltoSeqRun {
	
	void runEdParalleltoSeq() {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
		List<Integer> nums = numbers.parallelStream()
		.map(n -> n * 2)
		.peek(n -> System.out.printf("%s processing %d%n",
		Thread.currentThread().getName(), n))
		.sequential()
		.sorted()
		.collect(Collectors.toList());	
		
		nums.forEach(System.out::println);
	}

	
}