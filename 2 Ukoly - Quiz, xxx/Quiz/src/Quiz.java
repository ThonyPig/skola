import java.io.File;
import java.util.Scanner;

public class Quiz {

	public void start() {
		try {
			// Get scanner instance
			Scanner scanner = new Scanner(new File("quiz.csv"));

			// Set the delimiter used in file
			scanner.useDelimiter("; ");

			// Get all tokens and store them in some data structure
			// I am just printing them
			while (scanner.hasNext()) {
				System.out.print(scanner.next() + "|");
			}

			// Do not forget to close the scanner
			scanner.close();

		} catch (Exception ex) {
			System.err.println(ex);
		}
	}

}
