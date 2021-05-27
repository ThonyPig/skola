import java.io.BufferedReader;
import java.io.FileReader;

public class Quiz {

	public void start() {
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader("quiz.csv"));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    for(int i = 0; i < data.length; i++) {
			    	System.out.println(data[i] + "SSSSSS ");
			    }
			}
			csvReader.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}

}
