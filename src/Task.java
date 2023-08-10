import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
	
	public void task() throws IOException {
		/********* Begin *********/
		FileReader fileReader = new FileReader("src/step3/input/input.txt");
        FileWriter fileWriter = new FileWriter("src/step3/output/output.txt");
        int i ;
        while ((i = fileReader.read())!= -1) {
            fileWriter.write(i);
        }
		
		
		
		/********* End *********/		
	}
}