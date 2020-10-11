import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main (String [] args) throws Exception{
		BufferedReader read = new BufferedReader(new FileReader("name.txt"));
		String name;
		while((name = read.readLine()) != null ) {
			System.out.println(name);
		}
		read.close();
	}
}
