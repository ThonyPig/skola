package countingSpaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fReader = new FileReader("lm.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		int spaceCounter = 0;
		int letterCounter = 0;
		int wordCounter = 0;
		char lastChar = 0;
		
		for(int i = 0; i!=-1; i=bReader.read()) {
			if(i == 32) {
				spaceCounter++;
				lastChar = 32;
			}
			else {
				if((i <= 90 && i >=65) || (i <=122 && i >= 97)) {
					letterCounter++;
					if(lastChar == 32) {
						wordCounter++;
					}
					lastChar = (char)i;
				}
			}
		}
		
		System.out.println("Spaces: " +spaceCounter);
		System.out.println("Letters: " +letterCounter);
		System.out.println("Words: " +wordCounter);
		
	}

}
