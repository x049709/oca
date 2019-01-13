package allchapters;

import java.io.IOException;
//Suppressed messages from close() are in an array

class First implements AutoCloseable{
	public void close()  throws IOException {
		throw new IOException("Close - First");
	}
}


public class EdSuppressed {

	public static void main(String[] args) {
		try (First one = new First()) {
			throw new Exception("Try");
		}
		catch (Exception ex) {
			System.err.println(ex.getMessage());
			for (Throwable t: ex.getSuppressed()) {
				System.err.println("Suppressed message: " + t);
			}
		}
		finally {
			System.err.println("Finally");
		}

	}

}
