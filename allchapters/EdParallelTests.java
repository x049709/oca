package allchapters;

import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;
public class EdParallelTests {

	@Test
	public void sequentialStreamOf() throws Exception {
		assertFalse(Stream.of(3, 1, 4, 1, 5, 9).isParallel());
	}
	@Test
	public void sequentialIterateStream() throws Exception {
		assertFalse(Stream.iterate(1, n -> n + 1).isParallel());
	}
	@Test
	public void sequentialGenerateStream() throws Exception {
		assertFalse(Stream.generate(Math::random).isParallel());
	}
	@Test
	public void sequentialCollectionStream() throws Exception {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
		assertFalse(numbers.stream().isParallel());
	}

}

